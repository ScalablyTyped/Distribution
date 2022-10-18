package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mutation describes a self-contained change to a document. Mutations can
  * create, replace, delete, and update subsets of documents.
  *
  * Mutations not only act on the value of the document but also its version.
  *
  * For local mutations (mutations that haven't been committed yet), we preserve
  * the existing version for Set and Patch mutations. For Delete mutations, we
  * reset the version to 0.
  *
  * Here's the expected transition table.
  *
  * MUTATION           APPLIED TO            RESULTS IN
  *
  * SetMutation        Document(v3)          Document(v3)
  * SetMutation        NoDocument(v3)        Document(v0)
  * SetMutation        InvalidDocument(v0)   Document(v0)
  * PatchMutation      Document(v3)          Document(v3)
  * PatchMutation      NoDocument(v3)        NoDocument(v3)
  * PatchMutation      InvalidDocument(v0)   UnknownDocument(v3)
  * DeleteMutation     Document(v3)          NoDocument(v0)
  * DeleteMutation     NoDocument(v3)        NoDocument(v0)
  * DeleteMutation     InvalidDocument(v0)   NoDocument(v0)
  *
  * For acknowledged mutations, we use the updateTime of the WriteResponse as
  * the resulting version for Set and Patch mutations. As deletes have no
  * explicit update time, we use the commitTime of the WriteResponse for
  * Delete mutations.
  *
  * If a mutation is acknowledged by the backend but fails the precondition check
  * locally, we transition to an `UnknownDocument` and rely on Watch to send us
  * the updated version.
  *
  * Field transforms are used only with Patch and Set Mutations. We use the
  * `updateTransforms` message to store transforms, rather than the `transforms`s
  * messages.
  *
  * ## Subclassing Notes
  *
  * Every type of mutation needs to implement its own applyToRemoteDocument() and
  * applyToLocalView() to implement the actual behavior of applying the mutation
  * to some source document (see `setMutationApplyToRemoteDocument()` for an
  * example).
  */
trait Mutation extends StObject {
  
  val fieldTransforms: js.Array[FieldTransform]
  
  /**
    * Returns a `FieldMask` representing the fields that will be changed by
    * applying this mutation. Returns `null` if the mutation will overwrite the
    * entire document.
    */
  def getFieldMask(): FieldMask | Null
  
  val key: DocumentKey
  
  val precondition: Precondition
  
  val `type`: MutationType
}
object Mutation {
  
  inline def apply(
    fieldTransforms: js.Array[FieldTransform],
    getFieldMask: () => FieldMask | Null,
    key: DocumentKey,
    precondition: Precondition,
    `type`: MutationType
  ): Mutation = {
    val __obj = js.Dynamic.literal(fieldTransforms = fieldTransforms.asInstanceOf[js.Any], getFieldMask = js.Any.fromFunction0(getFieldMask), key = key.asInstanceOf[js.Any], precondition = precondition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutation]
  }
  
  extension [Self <: Mutation](x: Self) {
    
    inline def setFieldTransforms(value: js.Array[FieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformsVarargs(value: FieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value*))
    
    inline def setGetFieldMask(value: () => FieldMask | Null): Self = StObject.set(x, "getFieldMask", js.Any.fromFunction0(value))
    
    inline def setKey(value: DocumentKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrecondition(value: Precondition): Self = StObject.set(x, "precondition", value.asInstanceOf[js.Any])
    
    inline def setType(value: MutationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
