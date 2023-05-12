package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "AggregateField")
@js.native
/**
  * Create a new AggregateField<T>
  * @param _aggregateType Specifies the type of aggregation operation to perform.
  * @param _internalFieldPath Optionally specifies the field that is aggregated.
  * @internal
  */
open class AggregateField[T] () extends StObject {
  def this(_aggregateType: AggregateType) = this()
  def this(_aggregateType: Unit, _internalFieldPath: FieldPath2) = this()
  def this(_aggregateType: AggregateType, _internalFieldPath: FieldPath2) = this()
  
  val _aggregateType: AggregateType = js.native
  
  val _internalFieldPath: js.UndefOr[FieldPath2] = js.native
  
  /** A type string to uniquely identify instances of this class. */
  val `type`: /* "AggregateField" */ String = js.native
}
