package typings.frctlFractal.mod

import typings.frctlFractal.mod.fractal.api.assets.AssetCollection
import typings.frctlFractal.mod.fractal.api.files.FileCollection
import typings.frctlFractal.mod.fractal.api.variants.VariantCollection
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  /* was `typeof fractal.api.components.Component` */
  @JSImport("@frctl/fractal", "core.Component")
  @js.native
  open class Component protected ()
    extends typings.frctlFractal.mod.fractal.api.components.Component {
    def this(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity) = this()
  }
  /* was `typeof fractal.api.components.Component` */
  object Component {
    
    @JSImport("@frctl/fractal", "core.Component")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[
        js.Object | VariantCollection | typings.frctlFractal.mod.fractal.api.components.Component
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], files.asInstanceOf[js.Any], resources.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[
        js.Object | VariantCollection | typings.frctlFractal.mod.fractal.api.components.Component
      ]]
  }
  
  /* was `typeof fractal.api.docs.Doc` */
  @JSImport("@frctl/fractal", "core.Doc")
  @js.native
  open class Doc protected ()
    extends typings.frctlFractal.mod.fractal.api.docs.Doc {
    def this(config: Any, content: String, parent: Entity) = this()
  }
  /* was `typeof fractal.api.docs.Doc` */
  object Doc {
    
    @JSImport("@frctl/fractal", "core.Doc")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(config: Any, content: String, parent: Entity): typings.frctlFractal.mod.fractal.api.docs.Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], content.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.frctlFractal.mod.fractal.api.docs.Doc]
  }
  
  /* was `typeof fractal.api.variants.Variant` */
  @JSImport("@frctl/fractal", "core.Variant")
  @js.native
  open class Variant protected ()
    extends typings.frctlFractal.mod.fractal.api.variants.Variant {
    def this(
      config: js.Object,
      view: Any,
      resources: AssetCollection,
      parent: typings.frctlFractal.mod.fractal.api.components.Component
    ) = this()
  }
  /* was `typeof fractal.api.variants.Variant` */
  object Variant {
    
    @JSImport("@frctl/fractal", "core.Variant")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(
      config: js.Object,
      view: Any,
      resources: AssetCollection,
      parent: typings.frctlFractal.mod.fractal.api.components.Component
    ): typings.frctlFractal.mod.fractal.api.variants.Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], view.asInstanceOf[js.Any], resources.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.frctlFractal.mod.fractal.api.variants.Variant]
  }
}
