package typings.emotionUtils

import org.scalablytyped.runtime.StringDictionary
import typings.emotionUtils.emotionUtilsBooleans.`true`
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/utils", "getRegisteredStyles")
  @js.native
  def getRegisteredStyles(registered: RegisteredCache, registeredStyles: js.Array[String], classNames: String): String = js.native
  
  @JSImport("@emotion/utils", "insertStyles")
  @js.native
  def insertStyles(cache: EmotionCache, serialized: SerializedStyles, isStringTag: Boolean): String | Unit = js.native
  
  @JSImport("@emotion/utils", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  @js.native
  trait EmotionCache extends StObject {
    
    var compat: js.UndefOr[`true`] = js.native
    
    var inserted: StringDictionary[String | `true`] = js.native
    
    var key: String = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var registered: RegisteredCache = js.native
    
    var sheet: StyleSheet = js.native
    
    def stylis(key: String, value: String): js.Array[String] = js.native
  }
  object EmotionCache {
    
    @scala.inline
    def apply(
      inserted: StringDictionary[String | `true`],
      key: String,
      registered: RegisteredCache,
      sheet: StyleSheet,
      stylis: (String, String) => js.Array[String]
    ): EmotionCache = {
      val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], stylis = js.Any.fromFunction2(stylis))
      __obj.asInstanceOf[EmotionCache]
    }
    
    @scala.inline
    implicit class EmotionCacheMutableBuilder[Self <: EmotionCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompat(value: `true`): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
      
      @scala.inline
      def setInserted(value: StringDictionary[String | `true`]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setRegistered(value: RegisteredCache): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheet(value: StyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylis(value: (String, String) => js.Array[String]): Self = StObject.set(x, "stylis", js.Any.fromFunction2(value))
    }
  }
  
  type RegisteredCache = StringDictionary[String]
  
  @js.native
  trait SerializedStyles extends StObject {
    
    var map: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var next: js.UndefOr[SerializedStyles] = js.native
    
    var styles: String = js.native
  }
  object SerializedStyles {
    
    @scala.inline
    def apply(name: String, styles: String): SerializedStyles = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedStyles]
    }
    
    @scala.inline
    implicit class SerializedStylesMutableBuilder[Self <: SerializedStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: SerializedStyles): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StyleSheet extends StObject {
    
    var container: HTMLElement = js.native
    
    def flush(): Unit = js.native
    
    def insert(rule: String): Unit = js.native
    
    var key: String = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var tags: js.Array[HTMLStyleElement] = js.native
  }
  object StyleSheet {
    
    @scala.inline
    def apply(
      container: HTMLElement,
      flush: () => Unit,
      insert: String => Unit,
      key: String,
      tags: js.Array[HTMLStyleElement]
    ): StyleSheet = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), insert = js.Any.fromFunction1(insert), key = key.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheet]
    }
    
    @scala.inline
    implicit class StyleSheetMutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInsert(value: String => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[HTMLStyleElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
