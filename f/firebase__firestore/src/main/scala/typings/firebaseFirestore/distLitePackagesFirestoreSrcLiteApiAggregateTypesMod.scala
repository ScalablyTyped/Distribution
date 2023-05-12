package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreAggregateMod.AggregateType
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLiteApiAggregateTypesMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/lite-api/aggregate_types", "AggregateField")
  @js.native
  /**
    * Create a new AggregateField<T>
    * @param _aggregateType Specifies the type of aggregation operation to perform.
    * @param _internalFieldPath Optionally specifies the field that is aggregated.
    * @internal
    */
  open class AggregateField[T] () extends StObject {
    def this(_aggregateType: AggregateType) = this()
    def this(_aggregateType: Unit, _internalFieldPath: FieldPath) = this()
    def this(_aggregateType: AggregateType, _internalFieldPath: FieldPath) = this()
    
    val _aggregateType: AggregateType = js.native
    
    val _internalFieldPath: js.UndefOr[FieldPath] = js.native
    
    /** A type string to uniquely identify instances of this class. */
    val `type`: /* "AggregateField" */ String = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/lite-api/aggregate_types", "AggregateQuerySnapshot")
  @js.native
  open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected () extends StObject {
    /** @hideconstructor */
    def this(query: Query[Any], _userDataWriter: AbstractUserDataWriter, _data: ApiClientObjectMap[Value]) = this()
    
    /* private */ val _data: Any = js.native
    
    /* private */ val _userDataWriter: Any = js.native
    
    /**
      * Returns the results of the aggregations performed over the underlying
      * query.
      *
      * The keys of the returned object will be the same as those of the
      * `AggregateSpec` object specified to the aggregation method, and the values
      * will be the corresponding aggregation result.
      *
      * @returns The results of the aggregations performed over the underlying
      * query.
      */
    def data(): AggregateSpecData[T] = js.native
    
    /**
      * The underlying query over which the aggregations recorded in this
      * `AggregateQuerySnapshot` were performed.
      */
    val query: Query[Any] = js.native
    
    /** A type string to uniquely identify instances of this class. */
    val `type`: /* "AggregateQuerySnapshot" */ String = js.native
  }
  
  type AggregateFieldType = AggregateField[Double | Null]
  
  type AggregateSpec = StringDictionary[AggregateFieldType]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends @firebase/firestore.@firebase/firestore/dist/lite/packages/firestore/src/lite-api/aggregate_types.AggregateField<infer U>? U : never}
    }}}
    */
  @js.native
  trait AggregateSpecData[T /* <: AggregateSpec */] extends StObject
}
