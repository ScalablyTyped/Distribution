package typings.frctlFractal.mod

import typings.frctlFractal.mod.fractal.api.assets.AssetCollection
import typings.frctlFractal.mod.fractal.api.files.FileCollection
import typings.frctlFractal.mod.fractal.api.variants.VariantCollection
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  /* was `typeof fractal.api.components.Component` */
  @JSImport("@frctl/fractal", "core.Component")
  @js.native
  class Component protected ()
    extends typings.frctlFractal.mod.fractal.api.components.Component {
    def this(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity) = this()
  }
  /* was `typeof fractal.api.components.Component` */
  object Component {
    
    /* static member */
    @JSImport("@frctl/fractal", "core.Component.create")
    @js.native
    def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[
        js.Object | VariantCollection | typings.frctlFractal.mod.fractal.api.components.Component
      ] = js.native
  }
  
  /* was `typeof fractal.api.docs.Doc` */
  @JSImport("@frctl/fractal", "core.Doc")
  @js.native
  class Doc protected ()
    extends typings.frctlFractal.mod.fractal.api.docs.Doc {
    def this(config: js.Any, content: String, parent: Entity) = this()
  }
  /* was `typeof fractal.api.docs.Doc` */
  object Doc {
    
    /* static member */
    @JSImport("@frctl/fractal", "core.Doc.create")
    @js.native
    def create(config: js.Any, content: String, parent: Entity): typings.frctlFractal.mod.fractal.api.docs.Doc = js.native
  }
  
  /* was `typeof fractal.api.variants.Variant` */
  @JSImport("@frctl/fractal", "core.Variant")
  @js.native
  class Variant protected ()
    extends typings.frctlFractal.mod.fractal.api.variants.Variant {
    def this(
      config: js.Object,
      view: js.Any,
      resources: AssetCollection,
      parent: typings.frctlFractal.mod.fractal.api.components.Component
    ) = this()
  }
  /* was `typeof fractal.api.variants.Variant` */
  object Variant {
    
    /* static member */
    @JSImport("@frctl/fractal", "core.Variant.create")
    @js.native
    def create(
      config: js.Object,
      view: js.Any,
      resources: AssetCollection,
      parent: typings.frctlFractal.mod.fractal.api.components.Component
    ): typings.frctlFractal.mod.fractal.api.variants.Variant = js.native
  }
}
