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
  open class Cache[T /* <: Container[Any] */] () extends StObject {
    def this(changes: Changes) = this()
    
    /* private */ var _children: Any = js.native
    
    /* private */ var _counters: Any = js.native
    
    /* private */ var _keys: Any = js.native
    
    def add(style: T): Unit = js.native
    
    var changeId: Double = js.native
    
    var changes: js.UndefOr[Changes] = js.native
    
    def merge(cache: Cache[Any]): this.type = js.native
    
    def remove(style: T): Unit = js.native
    
    var sheet: js.Array[String] = js.native
    
    def unmerge(cache: Cache[Any]): this.type = js.native
    
    def values(): js.Array[T] = js.native
  }
  
  @JSImport("free-style", "FreeStyle")
  @js.native
  open class FreeStyle protected ()
    extends Cache[Rule | Style]
       with Container[FreeStyle] {
    def this(id: String) = this()
    def this(id: String, changes: Changes) = this()
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    def registerStyle(styles: Styles): String = js.native
  }
  
  @JSImport("free-style", "Rule")
  @js.native
  open class Rule protected ()
    extends Cache[Rule | Style]
       with Container[Rule] {
    def this(rule: String, style: String, pid: String) = this()
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    @JSName("id")
    def id_MRule: String = js.native
    
    /* private */ var pid: Any = js.native
    
    var rule: String = js.native
    
    var style: String = js.native
  }
  
  @JSImport("free-style", "Selector")
  @js.native
  open class Selector protected ()
    extends StObject
       with Container[Selector] {
    def this(selector: String) = this()
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    @JSName("id")
    def id_MSelector: String = js.native
    
    var selector: String = js.native
  }
  
  @JSImport("free-style", "Style")
  @js.native
  open class Style protected ()
    extends Cache[Selector]
       with Container[Style] {
    def this(style: String, pid: String) = this()
    
    /* CompleteClass */
    override def getStyles(): String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    @JSName("id")
    def id_MStyle: String = js.native
    
    /* private */ var pid: Any = js.native
    
    var style: String = js.native
  }
  
  inline def create(): FreeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FreeStyle]
  inline def create(changes: Changes): FreeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(changes.asInstanceOf[js.Any]).asInstanceOf[FreeStyle]
  
  trait Changes extends StObject {
    
    def add(style: Container[Any], index: Double): Unit
    
    def change(style: Container[Any], oldIndex: Double, newIndex: Double): Unit
    
    def remove(style: Container[Any], index: Double): Unit
  }
  object Changes {
    
    inline def apply(
      add: (Container[Any], Double) => Unit,
      change: (Container[Any], Double, Double) => Unit,
      remove: (Container[Any], Double) => Unit
    ): Changes = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), change = js.Any.fromFunction3(change), remove = js.Any.fromFunction2(remove))
      __obj.asInstanceOf[Changes]
    }
    
    extension [Self <: Changes](x: Self) {
      
      inline def setAdd(value: (Container[Any], Double) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setChange(value: (Container[Any], Double, Double) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
      
      inline def setRemove(value: (Container[Any], Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    }
  }
  
  trait Container[T] extends StObject {
    
    def getStyles(): String
    
    var id: String
  }
  object Container {
    
    inline def apply[T](getStyles: () => String, id: String): Container[T] = {
      val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction0(getStyles), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container[T]]
    }
    
    extension [Self <: Container[?], T](x: Self & Container[T]) {
      
      inline def setGetStyles(value: () => String): Self = StObject.set(x, "getStyles", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type PropertyValue = js.UndefOr[Double | Boolean | String | Null]
  
  trait Styles
    extends StObject
       with /* selector */ StringDictionary[PropertyValue | js.Array[PropertyValue] | Styles] {
    
    @JSName("$displayName")
    var $displayName: js.UndefOr[String] = js.undefined
    
    @JSName("$global")
    var $global: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$unique")
    var $unique: js.UndefOr[Boolean] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def set$displayName(value: String): Self = StObject.set(x, "$displayName", value.asInstanceOf[js.Any])
      
      inline def set$displayNameUndefined: Self = StObject.set(x, "$displayName", js.undefined)
      
      inline def set$global(value: Boolean): Self = StObject.set(x, "$global", value.asInstanceOf[js.Any])
      
      inline def set$globalUndefined: Self = StObject.set(x, "$global", js.undefined)
      
      inline def set$unique(value: Boolean): Self = StObject.set(x, "$unique", value.asInstanceOf[js.Any])
      
      inline def set$uniqueUndefined: Self = StObject.set(x, "$unique", js.undefined)
    }
  }
}
