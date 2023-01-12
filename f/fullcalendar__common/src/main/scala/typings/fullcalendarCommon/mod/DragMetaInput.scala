package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.RawOptionsFromRefiners<{  startTime :typeof createDuration,   duration :typeof createDuration,   create :std.BooleanConstructor,   sourceId :std.StringConstructor}> & {[otherProp: string] : any} */
trait DragMetaInput
  extends StObject
     with /* otherProp */ StringDictionary[Any] {
  
  var create: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.BooleanConstructor extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
  ] = js.undefined
  
  var duration: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof createDuration extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
  ] = js.undefined
  
  var sourceId: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.StringConstructor extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
  ] = js.undefined
  
  var startTime: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof createDuration extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
  ] = js.undefined
}
object DragMetaInput {
  
  inline def apply(): DragMetaInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragMetaInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragMetaInput] (val x: Self) extends AnyVal {
    
    inline def setCreate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.BooleanConstructor extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
    ): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDuration(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typeof createDuration extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
    ): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setSourceId(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.StringConstructor extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
    ): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setStartTime(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typeof createDuration extends (input : infer RawType): infer RefinedType ? any extends RawType ? RefinedType : RawType : never */ js.Any
    ): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
