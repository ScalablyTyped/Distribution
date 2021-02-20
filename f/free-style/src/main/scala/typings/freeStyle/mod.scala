package typings.freeStyle

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("free-style", "Cache")
  @js.native
  class Cache[T /* <: Container[_] */] () extends StObject {
    def this(changes: Changes) = this()
    
    var _children: js.Any = js.native
    
    var _counters: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    def add(style: T): Unit = js.native
    
    var changeId: Double = js.native
    
    var changes: Changes = js.native
    
    def merge(cache: Cache[_]): this.type = js.native
    
    def remove(style: T): Unit = js.native
    
    var sheet: js.Array[String] = js.native
    
    def unmerge(cache: Cache[_]): this.type = js.native
    
    def values(): js.Array[T] = js.native
  }
  
  @JSImport("free-style", "FreeStyle")
  @js.native
  class FreeStyle protected ()
    extends Cache[Rule | Style]
       with Container[FreeStyle] {
    def this(id: String) = this()
    def this(id: String, changes: Changes) = this()
    
    def registerCss(styles: Styles): Unit = js.native
    
    def registerHashRule(prefix: String, styles: Styles): String = js.native
    
    def registerKeyframes(keyframes: Styles): String = js.native
    
    def registerRule(rule: String, styles: Styles): Unit = js.native
    
    def registerStyle(styles: Styles): String = js.native
  }
  
  @JSImport("free-style", "Rule")
  @js.native
  class Rule protected ()
    extends Cache[Rule | Style]
       with Container[Rule] {
    def this(rule: String, style: String, id: String) = this()
    
    var rule: String = js.native
    
    var style: String = js.native
  }
  
  @JSImport("free-style", "Selector")
  @js.native
  class Selector protected () extends Container[Selector] {
    def this(selector: String, id: String) = this()
    
    var selector: String = js.native
  }
  
  @JSImport("free-style", "Style")
  @js.native
  class Style protected ()
    extends Cache[Selector]
       with Container[Style] {
    def this(style: String, id: String) = this()
    
    var style: String = js.native
  }
  
  @JSImport("free-style", "create")
  @js.native
  def create(): FreeStyle = js.native
  @JSImport("free-style", "create")
  @js.native
  def create(changes: Changes): FreeStyle = js.native
  
  @js.native
  trait Changes extends StObject {
    
    def add(style: Container[_], index: Double): Unit = js.native
    
    def change(style: Container[_], oldIndex: Double, newIndex: Double): Unit = js.native
    
    def remove(style: Container[_], index: Double): Unit = js.native
  }
  object Changes {
    
    @scala.inline
    def apply(
      add: (Container[_], Double) => Unit,
      change: (Container[_], Double, Double) => Unit,
      remove: (Container[_], Double) => Unit
    ): Changes = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), change = js.Any.fromFunction3(change), remove = js.Any.fromFunction2(remove))
      __obj.asInstanceOf[Changes]
    }
    
    @scala.inline
    implicit class ChangesMutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (Container[_], Double) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(value: (Container[_], Double, Double) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemove(value: (Container[_], Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Container[T] extends StObject {
    
    def getStyles(): String = js.native
    
    var id: String = js.native
  }
  object Container {
    
    @scala.inline
    def apply[T](getStyles: () => String, id: String): Container[T] = {
      val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction0(getStyles), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container[T]]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container[_], T] (val x: Self with Container[T]) extends AnyVal {
      
      @scala.inline
      def setGetStyles(value: () => String): Self = StObject.set(x, "getStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type HashFunction = js.Function1[/* str */ String, String]
  
  type PropertyValue = Double | Boolean | String
  
  @js.native
  trait Styles
    extends /* selector */ StringDictionary[js.UndefOr[Null | PropertyValue | js.Array[PropertyValue] | Styles]] {
    
    @JSName("$displayName")
    var $displayName: js.UndefOr[String] = js.native
    
    @JSName("$unique")
    var $unique: js.UndefOr[Boolean] = js.native
  }
  object Styles {
    
    @scala.inline
    def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$displayName(value: String): Self = StObject.set(x, "$displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$displayNameUndefined: Self = StObject.set(x, "$displayName", js.undefined)
      
      @scala.inline
      def set$unique(value: Boolean): Self = StObject.set(x, "$unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$uniqueUndefined: Self = StObject.set(x, "$unique", js.undefined)
    }
  }
}
