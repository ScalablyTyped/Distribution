package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typings.gaeaModel.anon.CurrentUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropsGaeaEdit extends StObject {
  
  /**
    * 当 editor 为 array 时的数组配置
    * 数组中的 key,和填入的值,会作为 Array<key:value> 填入到 value 中
    */
  var array: js.UndefOr[js.Array[ComponentPropsOptionsArrayValue]] = js.undefined
  
  /**
    * 是否可被编辑
    */
  var editable: Boolean
  
  /**
    * 编辑器类型
    */
  var editor: String
  
  /**
    * 为空时的值，默认为 null
    */
  var emptyValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 对应字段名
    */
  var field: String
  
  /**
    * 是否隐藏编辑工具
    */
  var hideTool: Boolean
  
  /**
    * 枚举实例
    */
  var instance: js.UndefOr[js.Array[StringDictionary[ComponentPropsOptionValue]]] = js.undefined
  
  /**
    * 选项名称
    */
  var label: String
  
  /**
    * 控制 number 单位
    */
  var number: js.UndefOr[CurrentUnit] = js.undefined
  
  /**
    * 当 editor 为 selector 时的数组配置
    */
  var selector: js.UndefOr[js.Array[ComponentPropsOptionsSelector]] = js.undefined
  
  /**
    * 值类型, 默认为字符串
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ComponentPropsGaeaEdit {
  
  inline def apply(editable: Boolean, editor: String, field: String, hideTool: Boolean, label: String): ComponentPropsGaeaEdit = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hideTool = hideTool.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsGaeaEdit]
  }
  
  extension [Self <: ComponentPropsGaeaEdit](x: Self) {
    
    inline def setArray(value: js.Array[ComponentPropsOptionsArrayValue]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setArrayVarargs(value: ComponentPropsOptionsArrayValue*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEmptyValue(value: js.Any): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    inline def setEmptyValueUndefined: Self = StObject.set(x, "emptyValue", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setHideTool(value: Boolean): Self = StObject.set(x, "hideTool", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: js.Array[StringDictionary[ComponentPropsOptionValue]]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInstanceVarargs(value: StringDictionary[ComponentPropsOptionValue]*): Self = StObject.set(x, "instance", js.Array(value :_*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: CurrentUnit): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setSelector(value: js.Array[ComponentPropsOptionsSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSelectorVarargs(value: ComponentPropsOptionsSelector*): Self = StObject.set(x, "selector", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
