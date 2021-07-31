package typings.freeStyle

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("free-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("free-style", "Cache")
  @js.native
  class Cache[T /* <: Container[js.Any] */] () extends StObject {
    def this(changes: Changes) = this()
    
    var _children: js.Any = js.native
    
    var _counters: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    def add(style: T): Unit = js.native
    
    var changeId: Double = js.native
    
    var changes: Changes = js.native
    
    def merge(cache: Cache[js.Any]): this.type = js.native
    
    def remove(style: T): Unit = js.native
    
    var sheet: js.Array[String] = js.native
    
    def unmerge(cache: Cache[js.Any]): this.type = js.native
    
    def values(): js.Array[T] = js.native
  }
  
  @JSImport("free-style", "FreeStyle")
  @js.native
  class FreeStyle protected ()
    extends Cache[Rule | Style]
       with Container[FreeStyle] {
    def this(id: String) = this()
    def this(id: String, changes: Changes) = this()
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
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
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    var rule: String = js.native
    
    var style: String = js.native
  }
  
  @JSImport("free-style", "Selector")
  @js.native
  class Selector protected ()
    extends StObject
       with Container[Selector] {
    def this(selector: String, id: String) = this()
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    var selector: String = js.native
  }
  
  @JSImport("free-style", "Style")
  @js.native
  class Style protected ()
    extends Cache[Selector]
       with Container[Style] {
    def this(style: String, id: String) = this()
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    var style: String = js.native
  }
  
  @scala.inline
  def create(): FreeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FreeStyle]
  @scala.inline
  def create(changes: Changes): FreeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(changes.asInstanceOf[js.Any]).asInstanceOf[FreeStyle]
  
  trait Changes extends StObject {
    
    def add(style: Container[js.Any], index: Double): Unit
    
    def change(style: Container[js.Any], oldIndex: Double, newIndex: Double): Unit
    
    def remove(style: Container[js.Any], index: Double): Unit
  }
  object Changes {
    
    @scala.inline
    def apply(
      add: (Container[js.Any], Double) => Unit,
      change: (Container[js.Any], Double, Double) => Unit,
      remove: (Container[js.Any], Double) => Unit
    ): Changes = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), change = js.Any.fromFunction3(change), remove = js.Any.fromFunction2(remove))
      __obj.asInstanceOf[Changes]
    }
    
    @scala.inline
    implicit class ChangesMutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (Container[js.Any], Double) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(value: (Container[js.Any], Double, Double) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemove(value: (Container[js.Any], Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    }
  }
  
  trait Container[T] extends StObject {
    
    def getStyles(): String
    
    var id: String
  }
  object Container {
    
    @scala.inline
    def apply[T](getStyles: () => String, id: String): Container[T] = {
      val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction0(getStyles), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container[T]]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container[?], T] (val x: Self & Container[T]) extends AnyVal {
      
      @scala.inline
      def setGetStyles(value: () => String): Self = StObject.set(x, "getStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type HashFunction = js.Function1[/* str */ String, String]
  
  type PropertyValue = Double | Boolean | String
  
  trait Styles
    extends StObject
       with /* selector */ StringDictionary[js.UndefOr[Null | PropertyValue | js.Array[PropertyValue] | Styles]] {
    
    @JSName("$displayName")
    var $displayName: js.UndefOr[String] = js.undefined
    
    @JSName("$unique")
    var $unique: js.UndefOr[Boolean] = js.undefined
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
