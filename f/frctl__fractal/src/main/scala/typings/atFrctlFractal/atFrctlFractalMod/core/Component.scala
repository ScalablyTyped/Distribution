package typings.atFrctlFractal.atFrctlFractalMod.core

import org.scalablytyped.runtime.Instantiable4
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.assets.AssetCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.files.FileCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.variants.VariantCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.entities.Entity
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "core.Component")
@js.native
object Component
  extends Instantiable4[
      /* config */ js.Object, 
      /* files */ FileCollection, 
      /* resources */ AssetCollection, 
      /* parent */ Entity, 
      typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components.Component
    ] {
  def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[
    js.Object | VariantCollection | typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components.Component
  ] = js.native
}

