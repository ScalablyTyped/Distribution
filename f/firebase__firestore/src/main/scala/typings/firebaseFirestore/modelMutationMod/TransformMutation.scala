package typings.firebaseFirestore.modelMutationMod

import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", "TransformMutation")
@js.native
class TransformMutation protected () extends Mutation {
  def this(key: DocumentKey, fieldTransforms: js.Array[FieldTransform]) = this()
  val fieldTransforms: js.Array[FieldTransform] = js.native
  /**
    * Creates a list of "transform results" (a transform result is a field value
    * representing the result of applying a transform) for use when applying a
    * TransformMutation locally.
    *
    * @param localWriteTime The local time of the transform mutation (used to
    *     generate ServerTimestampValues).
    * @param maybeDoc The current state of the document after applying all
    *     previous mutations.
    * @param baseDoc The document prior to applying this mutation batch.
    * @return The transform results list.
    */
  var localTransformResults: js.Any = js.native
  /**
    * Asserts that the given MaybeDocument is actually a Document and verifies
    * that it matches the key for this mutation. Since we only support
    * transformations with precondition exists this method is guaranteed to be
    * safe.
    */
  var requireDocument: js.Any = js.native
  /**
    * Creates a list of "transform results" (a transform result is a field value
    * representing the result of applying a transform) for use after a
    * TransformMutation has been acknowledged by the server.
    *
    * @param baseDoc The document prior to applying this mutation batch.
    * @param serverTransformResults The transform results received by the server.
    * @return The transform results list.
    */
  var serverTransformResults: js.Any = js.native
  var transformObject: js.Any = js.native
}

