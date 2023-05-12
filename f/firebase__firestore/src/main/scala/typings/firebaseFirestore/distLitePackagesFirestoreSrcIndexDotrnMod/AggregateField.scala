package typings.firebaseFirestore.distLitePackagesFirestoreSrcIndexDotrnMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreAggregateMod.AggregateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/index.rn", "AggregateField")
@js.native
/**
  * Create a new AggregateField<T>
  * @param _aggregateType Specifies the type of aggregation operation to perform.
  * @param _internalFieldPath Optionally specifies the field that is aggregated.
  * @internal
  */
open class AggregateField[T] ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.AggregateField[T] {
  def this(_aggregateType: AggregateType) = this()
  def this(
    _aggregateType: Unit,
    _internalFieldPath: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.FieldPath
  ) = this()
  def this(
    _aggregateType: AggregateType,
    _internalFieldPath: typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.FieldPath
  ) = this()
}
