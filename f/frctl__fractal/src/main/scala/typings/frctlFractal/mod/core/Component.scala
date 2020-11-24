package typings.frctlFractal.mod.core

import org.scalablytyped.runtime.Instantiable4
import typings.frctlFractal.mod.fractal.api.assets.AssetCollection
import typings.frctlFractal.mod.fractal.api.files.FileCollection
import typings.frctlFractal.mod.fractal.api.variants.VariantCollection
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "core.Component")
@js.native
object Component
  extends Instantiable4[
      /* config */ js.Object, 
      /* files */ FileCollection, 
      /* resources */ AssetCollection, 
      /* parent */ Entity, 
      typings.frctlFractal.mod.fractal.api.components.Component
    ] {
  
  def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[
    js.Object | VariantCollection | typings.frctlFractal.mod.fractal.api.components.Component
  ] = js.native
}
