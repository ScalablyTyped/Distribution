package typings.fastCsvParse

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  @JSImport("@fast-csv/parse/build/src/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSyncTransform[I /* <: Row[Any] */, O /* <: Row[Any] */](transform: RowTransformFunction[I, O]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean]
  
  inline def isSyncValidate[R /* <: Row[Any] */](validate: RowValidate[R]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncValidate")(validate.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean]
  
  type AsyncRowTransform[I /* <: Row[Any] */, O /* <: Row[Any] */] = js.Function2[/* row */ I, /* cb */ RowTransformCallback[O], Unit]
  
  type AsyncRowValidate[R /* <: Row[Any] */] = js.Function2[/* row */ R, /* cb */ RowValidateCallback, Unit]
  
  type HeaderArray = js.Array[js.UndefOr[String | Null]]
  
  type HeaderTransformFunction = js.Function1[/* headers */ HeaderArray, HeaderArray]
  
  type Row[V] = RowMap[V] | RowArray[V]
  
  type RowArray[V] = js.Array[V]
  
  type RowMap[V] = Record[String, V]
  
  type RowTransformCallback[R /* <: Row[Any] */] = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* row */ js.UndefOr[R], Unit]
  
  type RowTransformFunction[I /* <: Row[Any] */, O /* <: Row[Any] */] = (SyncRowTransform[I, O]) | (AsyncRowTransform[I, O])
  
  type RowValidate[R /* <: Row[Any] */] = AsyncRowValidate[R] | SyncRowValidate[R]
  
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[js.Error | Null], 
    /* isValid */ js.UndefOr[Boolean], 
    /* reason */ js.UndefOr[String], 
    Unit
  ]
  
  trait RowValidationResult[R /* <: Row[Any] */] extends StObject {
    
    var isValid: Boolean
    
    var reason: js.UndefOr[String] = js.undefined
    
    var row: R | Null
  }
  object RowValidationResult {
    
    inline def apply[R /* <: Row[Any] */](isValid: Boolean): RowValidationResult[R] = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], row = null)
      __obj.asInstanceOf[RowValidationResult[R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowValidationResult[?], R /* <: Row[Any] */] (val x: Self & RowValidationResult[R]) extends AnyVal {
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setRow(value: R): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowNull: Self = StObject.set(x, "row", null)
    }
  }
  
  type RowValidatorCallback[R /* <: Row[Any] */] = js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[RowValidationResult[R]], Unit]
  
  type SyncRowTransform[I /* <: Row[Any] */, O /* <: Row[Any] */] = js.Function1[/* row */ I, O]
  
  type SyncRowValidate[R /* <: Row[Any] */] = js.Function1[/* row */ R, Boolean]
}
