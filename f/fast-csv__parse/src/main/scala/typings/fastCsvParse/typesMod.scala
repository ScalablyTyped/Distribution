package typings.fastCsvParse

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@fast-csv/parse/build/src/types", "isSyncTransform")
  @js.native
  def isSyncTransform[I /* <: Row[_] */, O /* <: Row[_] */](transform: RowTransformFunction[I, O]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean = js.native
  
  @JSImport("@fast-csv/parse/build/src/types", "isSyncValidate")
  @js.native
  def isSyncValidate[R /* <: Row[_] */](validate: RowValidate[R]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean = js.native
  
  type AsyncRowTransform[I /* <: Row[_] */, O /* <: Row[_] */] = js.Function2[/* row */ I, /* cb */ RowTransformCallback[O], Unit]
  
  type AsyncRowValidate[R /* <: Row[_] */] = js.Function2[/* row */ R, /* cb */ RowValidateCallback, Unit]
  
  type HeaderArray = js.Array[js.UndefOr[String | Null]]
  
  type HeaderTransformFunction = js.Function1[/* headers */ HeaderArray, HeaderArray]
  
  type Row[V] = RowMap[V] | RowArray[V]
  
  type RowArray[V] = js.Array[V]
  
  type RowMap[V] = Record[String, V]
  
  type RowTransformCallback[R /* <: Row[_] */] = js.Function2[/* error */ js.UndefOr[Error | Null], /* row */ js.UndefOr[R], Unit]
  
  type RowTransformFunction[I /* <: Row[_] */, O /* <: Row[_] */] = (SyncRowTransform[I, O]) | (AsyncRowTransform[I, O])
  
  type RowValidate[R /* <: Row[_] */] = AsyncRowValidate[R] | SyncRowValidate[R]
  
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[Error | Null], 
    /* isValid */ js.UndefOr[Boolean], 
    /* reason */ js.UndefOr[String], 
    Unit
  ]
  
  @js.native
  trait RowValidationResult[R /* <: Row[_] */] extends StObject {
    
    var isValid: Boolean = js.native
    
    var reason: js.UndefOr[String] = js.native
    
    var row: R | Null = js.native
  }
  object RowValidationResult {
    
    @scala.inline
    def apply[R /* <: Row[_] */](isValid: Boolean): RowValidationResult[R] = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowValidationResult[R]]
    }
    
    @scala.inline
    implicit class RowValidationResultMutableBuilder[Self <: RowValidationResult[_], R /* <: Row[_] */] (val x: Self with RowValidationResult[R]) extends AnyVal {
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setRow(value: R): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowNull: Self = StObject.set(x, "row", null)
    }
  }
  
  type RowValidatorCallback[R /* <: Row[_] */] = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[RowValidationResult[R]], Unit]
  
  type SyncRowTransform[I /* <: Row[_] */, O /* <: Row[_] */] = js.Function1[/* row */ I, O]
  
  type SyncRowValidate[R /* <: Row[_] */] = js.Function1[/* row */ R, Boolean]
}
