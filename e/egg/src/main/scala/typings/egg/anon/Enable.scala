package typings.egg.anon

import typings.egg.mod.Context
import typings.egg.mod.IgnoreItem
import typings.egg.mod.IgnoreOrMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enable extends StObject {
  
  var enable: Boolean
  
  var enableTypes: js.Array[String]
  
  var encoding: String
  
  var extendTypes: Form
  
  var formLimit: String
  
  var ignore: IgnoreOrMatch
  
  var jsonLimit: String
  
  var `match`: IgnoreOrMatch
  
  var queryString: ArrayLimit
  
  var strict: Boolean
  
  var textLimit: String
}
object Enable {
  
  inline def apply(
    enable: Boolean,
    enableTypes: js.Array[String],
    encoding: String,
    extendTypes: Form,
    formLimit: String,
    ignore: IgnoreOrMatch,
    jsonLimit: String,
    `match`: IgnoreOrMatch,
    queryString: ArrayLimit,
    strict: Boolean,
    textLimit: String
  ): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enableTypes = enableTypes.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extendTypes = extendTypes.asInstanceOf[js.Any], formLimit = formLimit.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], jsonLimit = jsonLimit.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], textLimit = textLimit.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableTypes(value: js.Array[String]): Self = StObject.set(x, "enableTypes", value.asInstanceOf[js.Any])
    
    inline def setEnableTypesVarargs(value: String*): Self = StObject.set(x, "enableTypes", js.Array(value*))
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setExtendTypes(value: Form): Self = StObject.set(x, "extendTypes", value.asInstanceOf[js.Any])
    
    inline def setFormLimit(value: String): Self = StObject.set(x, "formLimit", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: IgnoreOrMatch): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFunction1(value: /* ctx */ Context[Any] => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
    
    inline def setIgnoreVarargs(value: IgnoreItem*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setJsonLimit(value: String): Self = StObject.set(x, "jsonLimit", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: IgnoreOrMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchFunction1(value: /* ctx */ Context[Any] => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    
    inline def setMatchVarargs(value: IgnoreItem*): Self = StObject.set(x, "match", js.Array(value*))
    
    inline def setQueryString(value: ArrayLimit): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setTextLimit(value: String): Self = StObject.set(x, "textLimit", value.asInstanceOf[js.Any])
  }
}
