package typings.firebaseFirestore.modelFieldValueMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeOrder extends js.Object

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "TypeOrder")
@js.native
object TypeOrder extends js.Object {
  @js.native
  sealed trait ArrayValue extends TypeOrder
  
  @js.native
  sealed trait BlobValue extends TypeOrder
  
  @js.native
  sealed trait BooleanValue extends TypeOrder
  
  @js.native
  sealed trait GeoPointValue extends TypeOrder
  
  @js.native
  sealed trait NullValue extends TypeOrder
  
  @js.native
  sealed trait NumberValue extends TypeOrder
  
  @js.native
  sealed trait ObjectValue extends TypeOrder
  
  @js.native
  sealed trait RefValue extends TypeOrder
  
  @js.native
  sealed trait StringValue extends TypeOrder
  
  @js.native
  sealed trait TimestampValue extends TypeOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeOrder with Double] = js.native
  /* 8 */ @js.native
  object ArrayValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.ArrayValue with Double]
  
  /* 5 */ @js.native
  object BlobValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.BlobValue with Double]
  
  /* 1 */ @js.native
  object BooleanValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.BooleanValue with Double]
  
  /* 7 */ @js.native
  object GeoPointValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.GeoPointValue with Double]
  
  /* 0 */ @js.native
  object NullValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.NullValue with Double]
  
  /* 2 */ @js.native
  object NumberValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.NumberValue with Double]
  
  /* 9 */ @js.native
  object ObjectValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.ObjectValue with Double]
  
  /* 6 */ @js.native
  object RefValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.RefValue with Double]
  
  /* 4 */ @js.native
  object StringValue
    extends TopLevel[typings.firebaseFirestore.modelFieldValueMod.TypeOrder.StringValue with Double]
  
  /* 3 */ @js.native
  object TimestampValue
    extends TopLevel[
          typings.firebaseFirestore.modelFieldValueMod.TypeOrder.TimestampValue with Double
        ]
  
}

