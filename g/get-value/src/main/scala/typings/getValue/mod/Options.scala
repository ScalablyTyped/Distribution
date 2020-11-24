package typings.getValue.mod

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The default value to return when get-value cannot result a value from the given object.
    *
    * default: `undefined`
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * If defined, this function is called on each resolved value.
    * Useful if you want to do `.hasOwnProperty` or `Object.prototype.propertyIsEnumerable`.
    */
  var isValid: js.UndefOr[js.Function2[/* key */ String, /* object */ Record[String, _], Boolean]] = js.native
  
  /**
    * Customize how the object path is created when iterating over path segments.
    *
    * default: `Array.join`
    */
  var join: js.UndefOr[js.Function1[/* segs */ js.Array[String], String]] = js.native
  
  /**
    * The character to use when re-joining the string to check for keys
    * with dots in them (this is probably not needed when `options.join` is used).
    * This can be a different value than the separator, since the separator can be a string or regex.
    *
    * default: `"."`
    */
  var joinChar: js.UndefOr[String] = js.native
  
  /**
    * The separator to use for spliting the string.
    * (this is probably not needed when `options.split` is used).
    *
    *  default: `"."`
    */
  var separator: js.UndefOr[String | RegExp] = js.native
  
  /**
    * Custom function to use for splitting the string into object path segments.
    *
    * default: `String.split`
    */
  var split: js.UndefOr[js.Function1[/* s */ String, js.Array[String]]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setIsValid(value: (/* key */ String, /* object */ Record[String, _]) => Boolean): Self = this.set("isValid", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setJoin(value: /* segs */ js.Array[String] => String): Self = this.set("join", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    
    @scala.inline
    def setJoinChar(value: String): Self = this.set("joinChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinChar: Self = this.set("joinChar", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | RegExp): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSplit(value: /* s */ String => js.Array[String]): Self = this.set("split", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
}
