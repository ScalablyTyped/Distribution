package typings.frctlFractal.mod.fractal

import typings.frctlFractal.anon.Register
import typings.frctlFractal.frctlFractalBooleans.`true`
import typings.frctlFractal.mod.Adapter
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import typings.frctlFractal.mod.fractal.core.mixins.Collection
import typings.frctlFractal.mod.fractal.core.mixins.Source
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Readable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  object entities {
    
    @JSImport("@frctl/fractal", "fractal.core.entities.Entity")
    @js.native
    abstract class Entity ()
      extends typings.frctlFractal.mod.fractal.core.mixins.Entity {
      
      def getContext(): js.Any = js.native
      
      def getResolvedContext(): js.Any = js.native
      
      def hasContext(): js.Promise[Boolean] = js.native
      
      val isCollection: js.UndefOr[`true`] = js.native
      
      val isComponent: js.UndefOr[`true`] = js.native
      
      val isDoc: js.UndefOr[`true`] = js.native
      
      val isVariant: js.UndefOr[`true`] = js.native
      
      def setContext(data: js.Any): Unit = js.native
      
      val status: StatusInfo = js.native
    }
    
    @js.native
    trait EntityCollection[T /* <: Entity */]
      extends typings.frctlFractal.mod.fractal.core.mixins.Entity
         with Collection[T] {
      
      val entities: this.type = js.native
      
      /* InferMemberOverrides */
      override def toJSON(): js.Object = js.native
    }
    
    @js.native
    trait EntitySource[T /* <: Entity */, TConfig] extends Source[T, TConfig] {
      
      def engine[TEngine](): Adapter[TEngine] = js.native
      def engine[TEngine](adapterFactory: String): Adapter[TEngine] = js.native
      def engine[TEngine](adapterFactory: js.Function0[Register[T, TEngine]]): Adapter[TEngine] = js.native
      def engine[TEngine](adapterFactory: Register[T, TEngine]): Adapter[TEngine] = js.native
      
      def entities(): js.Array[T] = js.native
      
      def getProp(key: String): String | js.Object = js.native
      
      def statusInfo(handle: String): StatusInfo | Null = js.native
    }
  }
  
  object mixins {
    
    @JSImport("@frctl/fractal", "fractal.core.mixins.Configurable")
    @js.native
    abstract class Configurable[T] () extends StObject {
      
      def config(): T = js.native
      def config(config: T): this.type = js.native
      
      def get[K /* <: /* keyof T */ String */, V](path: K): js.UndefOr[
            (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
          ] = js.native
      def get[K /* <: /* keyof T */ String */, V](path: K, defaultValue: V): js.UndefOr[
            (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
          ] = js.native
      
      def set[K /* <: /* keyof T */ String */](path: K): this.type = js.native
      def set[K /* <: /* keyof T */ String */](
        path: K,
        value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ): this.type = js.native
    }
    
    /**
      * Combined EventEmitter and Configurable mixins
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.frctlFractal.mod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @JSImport("@frctl/fractal", "fractal.core.mixins.ConfigurableEmitter")
    @js.native
    abstract class ConfigurableEmitter[T] () extends EventEmitter {
      def this(options: EventEmitterOptions) = this()
      
      def config(): T = js.native
      def config(config: T): this.type = js.native
      
      def get[K /* <: /* keyof T */ String */, V](path: K): js.UndefOr[
            (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
          ] = js.native
      def get[K /* <: /* keyof T */ String */, V](path: K, defaultValue: V): js.UndefOr[
            (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
          ] = js.native
      
      def set[K /* <: /* keyof T */ String */](path: K): this.type = js.native
      def set[K /* <: /* keyof T */ String */](
        path: K,
        value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ): this.type = js.native
    }
    
    @JSImport("@frctl/fractal", "fractal.core.mixins.Entity")
    @js.native
    abstract class Entity () extends StObject {
      
      val alias: String | Null = js.native
      
      var config: js.Any = js.native
      
      var handle: String = js.native
      
      var id: String = js.native
      
      def initEntity(name: String, config: js.Any, parent: Entity): Unit = js.native
      
      val isHidden: Boolean = js.native
      
      var label: String = js.native
      
      var name: String = js.native
      
      var order: Double = js.native
      
      val parent: Entity = js.native
      
      val source: EntitySource[typings.frctlFractal.mod.fractal.core.entities.Entity, js.Any] = js.native
      
      var title: String = js.native
      
      def toJSON(): js.Object = js.native
    }
    
    @js.native
    trait Collection[T] extends StObject {
      
      def collections(): this.type = js.native
      
      def each(fn: js.Function1[/* item */ T, Unit]): this.type = js.native
      
      def eq(pos: Double): js.UndefOr[T] = js.native
      
      def filter(handle: String): js.Array[T] = js.native
      def filter[TKey /* <: /* keyof T */ String */](
        name: TKey,
        value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
      ): js.Array[T] = js.native
      
      def filterItems(items: js.Array[T], handle: String): js.Array[T] = js.native
      def filterItems[TKey /* <: /* keyof T */ String */](
        items: js.Array[T],
        name: TKey,
        value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
      ): js.Array[T] = js.native
      
      def find(handle: String): T = js.native
      def find[TKey /* <: /* keyof T */ String */](
        name: TKey,
        value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
      ): T = js.native
      
      def findCollection(handle: String): Collection[T] = js.native
      def findCollection[TKey /* <: /* keyof T */ String */](
        name: TKey,
        value: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
      ): Collection[T] = js.native
      
      def first(): js.UndefOr[T] = js.native
      
      def flatten(): this.type = js.native
      
      def flattenDeep(): this.type = js.native
      
      def flattenItems(items: js.Array[T]): js.Array[T] = js.native
      def flattenItems(items: js.Array[T], deep: Boolean): js.Array[T] = js.native
      
      def forEach(fn: js.Function1[/* item */ T, Unit]): this.type = js.native
      
      val isAsset: Unit = js.native
      
      val isCollection: `true` = js.native
      
      val isComponent: Unit = js.native
      
      val isDoc: Unit = js.native
      
      val isFile: Unit = js.native
      
      val isVariant: Unit = js.native
      
      val items: js.Array[T] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator: js.Function0[IterableIterator[T]] = js.native
      
      def last(): js.UndefOr[T] = js.native
      
      def map(fn: js.Function1[/* item */ T, T]): this.type = js.native
      
      def newSelf(items: js.Array[T]): this.type = js.native
      
      def orderBy(): this.type = js.native
      
      def pushItem(item: T): this.type = js.native
      
      def removeItem(item: T): this.type = js.native
      
      def setItems(items: js.Array[T]): this.type = js.native
      
      val size: Double = js.native
      
      def squash(): this.type = js.native
      
      def squashItems(items: js.Array[T]): js.Array[T] = js.native
      
      def toArray(): js.Array[T] = js.native
      
      def toJSON(): js.Object = js.native
      
      def toStream(): Readable = js.native
    }
    
    @js.native
    trait Source[T, TConfig]
      extends ConfigurableEmitter[TConfig]
         with Collection[T] {
      
      def exists(): Boolean = js.native
      
      val fullPath: String | Null = js.native
      
      def isConfig(file: String): Boolean = js.native
      
      val isWatching: Boolean = js.native
      
      val label: String = js.native
      
      def load(): js.Promise[this.type] = js.native
      def load(force: Boolean): js.Promise[this.type] = js.native
      
      def refresh(): js.Promise[this.type] = js.native
      
      val relPath: String = js.native
      
      val source: this.type = js.native
      
      val title: String = js.native
      
      def unwatch(): Unit = js.native
      
      def watch(): Unit = js.native
    }
  }
  
  trait StatusInfo extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var label: String
  }
  object StatusInfo {
    
    @scala.inline
    def apply(label: String): StatusInfo = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusInfo]
    }
    
    @scala.inline
    implicit class StatusInfoMutableBuilder[Self <: StatusInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
