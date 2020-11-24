package typings.emberUtils.typesMod

import typings.std.Date
import typings.std.Error
import typings.std.FileList
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeLookup extends js.Object {
  
  var array: js.Array[_] = js.native
  
  var boolean: Boolean = js.native
  
  var date: Date = js.native
  
  var error: Error = js.native
  
  var filelist: FileList = js.native
  
  def function(args: js.Any*): js.Any = js.native
  
  var `null`: Null = js.native
  
  var number: Double = js.native
  
  var regexp: RegExp = js.native
  
  var string: String = js.native
  
  var undefined: js.UndefOr[scala.Nothing] = js.native
}
object TypeLookup {
  
  @scala.inline
  def apply(
    array: js.Array[_],
    boolean: Boolean,
    date: Date,
    error: Error,
    filelist: FileList,
    function: /* repeated */ js.Any => js.Any,
    `null`: Null,
    number: Double,
    regexp: RegExp,
    string: String
  ): TypeLookup = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filelist = filelist.asInstanceOf[js.Any], function = js.Any.fromFunction1(function), number = number.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLookup]
  }
  
  @scala.inline
  implicit class TypeLookupOps[Self <: TypeLookup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayVarargs(value: js.Any*): Self = this.set("array", js.Array(value :_*))
    
    @scala.inline
    def setArray(value: js.Array[_]): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: Boolean): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilelist(value: FileList): Self = this.set("filelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: /* repeated */ js.Any => js.Any): Self = this.set("function", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNull(value: Null): Self = this.set("null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexp(value: RegExp): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}
