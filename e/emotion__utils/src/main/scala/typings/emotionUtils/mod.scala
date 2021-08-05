package typings.emotionUtils

import org.scalablytyped.runtime.StringDictionary
import typings.emotionUtils.emotionUtilsBooleans.`true`
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegisteredStyles(registered: RegisteredCache, registeredStyles: js.Array[String], classNames: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredStyles")(registered.asInstanceOf[js.Any], registeredStyles.asInstanceOf[js.Any], classNames.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def insertStyles(cache: EmotionCache, serialized: SerializedStyles, isStringTag: Boolean): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertStyles")(cache.asInstanceOf[js.Any], serialized.asInstanceOf[js.Any], isStringTag.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  
  @JSImport("@emotion/utils", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  trait EmotionCache extends StObject {
    
    var compat: js.UndefOr[`true`] = js.undefined
    
    var inserted: StringDictionary[String | `true`]
    
    var key: String
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var registered: RegisteredCache
    
    var sheet: StyleSheet
    
    def stylis(key: String, value: String): js.Array[String]
  }
  object EmotionCache {
    
    inline def apply(
      inserted: StringDictionary[String | `true`],
      key: String,
      registered: RegisteredCache,
      sheet: StyleSheet,
      stylis: (String, String) => js.Array[String]
    ): EmotionCache = {
      val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], stylis = js.Any.fromFunction2(stylis))
      __obj.asInstanceOf[EmotionCache]
    }
    
    extension [Self <: EmotionCache](x: Self) {
      
      inline def setCompat(value: `true`): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
      
      inline def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
      
      inline def setInserted(value: StringDictionary[String | `true`]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setRegistered(value: RegisteredCache): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
      
      inline def setSheet(value: StyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setStylis(value: (String, String) => js.Array[String]): Self = StObject.set(x, "stylis", js.Any.fromFunction2(value))
    }
  }
  
  type RegisteredCache = StringDictionary[String]
  
  trait SerializedStyles extends StObject {
    
    var map: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var next: js.UndefOr[SerializedStyles] = js.undefined
    
    var styles: String
  }
  object SerializedStyles {
    
    inline def apply(name: String, styles: String): SerializedStyles = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedStyles]
    }
    
    extension [Self <: SerializedStyles](x: Self) {
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNext(value: SerializedStyles): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleSheet extends StObject {
    
    var container: HTMLElement
    
    def flush(): Unit
    
    def insert(rule: String): Unit
    
    var key: String
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var tags: js.Array[HTMLStyleElement]
  }
  object StyleSheet {
    
    inline def apply(
      container: HTMLElement,
      flush: () => Unit,
      insert: String => Unit,
      key: String,
      tags: js.Array[HTMLStyleElement]
    ): StyleSheet = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), insert = js.Any.fromFunction1(insert), key = key.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheet]
    }
    
    extension [Self <: StyleSheet](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setInsert(value: String => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTags(value: js.Array[HTMLStyleElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
