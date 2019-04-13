package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  class ComponentCls protected ()
    extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component {
    def this(config: js.Object, files: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection, resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity) = this()
  }
  
  @js.native
  class DocCls protected ()
    extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc {
    def this(config: js.Any, content: java.lang.String, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity) = this()
  }
  
  @js.native
  class VariantCls protected ()
    extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant {
    def this(config: js.Object, view: js.Any, resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component) = this()
  }
  
  @js.native
  object Component
    extends org.scalablytyped.runtime.Instantiable4[
          /* config */ js.Object, 
          /* files */ atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection, 
          /* resources */ atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, 
          /* parent */ atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity, 
          atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
        ] {
    def create(
      config: js.Object,
      files: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection,
      resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection,
      parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity
    ): stdLib.IterableIterator[
        js.Object | atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.VariantCollection | atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
      ] = js.native
  }
  
  @js.native
  object Doc
    extends org.scalablytyped.runtime.Instantiable3[
          /* config */ js.Any, 
          /* content */ java.lang.String, 
          /* parent */ atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity, 
          atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc
        ] {
    def create(
      config: js.Any,
      content: java.lang.String,
      parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity
    ): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc = js.native
  }
  
  @js.native
  object Variant
    extends org.scalablytyped.runtime.Instantiable4[
          /* config */ js.Object, 
          /* view */ js.Any, 
          /* resources */ atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, 
          /* parent */ atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component, 
          atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant
        ] {
    def create(
      config: js.Object,
      view: js.Any,
      resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection,
      parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
    ): atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant = js.native
  }
  
  type Component = atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
  type Doc = atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc
  type Variant = atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant
}

