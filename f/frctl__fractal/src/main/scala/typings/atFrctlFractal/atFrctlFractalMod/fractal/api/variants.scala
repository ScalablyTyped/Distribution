package typings.atFrctlFractal.atFrctlFractalMod.fractal.api

import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.assets.AssetCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components.Component
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.variants.Variant
import typings.atFrctlFractal.atFrctlFractalMod.fractal.api.variants.VariantCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.entities.Entity
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.entities.EntityCollection
import typings.atFrctlFractal.atFrctlFractalNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal.api.variants")
@js.native
object variants extends js.Object {
  @js.native
  class Variant protected () extends Entity {
    def this(config: js.Object, view: js.Any, resources: AssetCollection, parent: Component) = this()
    val baseHandle: String = js.native
    val content: String = js.native
    var editorMode: String = js.native
    var editorScope: String = js.native
    val isAsset: js.UndefOr[scala.Nothing] = js.native
    @JSName("isCollection")
    val isCollection_Variant: js.UndefOr[scala.Nothing] = js.native
    @JSName("isComponent")
    val isComponent_Variant: js.UndefOr[scala.Nothing] = js.native
    var isDefault: Boolean = js.native
    @JSName("isDoc")
    val isDoc_Variant: js.UndefOr[scala.Nothing] = js.native
    val isFile: `true` = js.native
    @JSName("isVariant")
    val isVariant_Variant: `true` = js.native
    var lang: String = js.native
    val notes: String = js.native
    val referencedBy: js.Array[_] = js.native
    val references: js.Array[_] = js.native
    var relViewPath: String = js.native
    val siblings: VariantCollection = js.native
    var view: js.Any = js.native
    var viewDir: String = js.native
    var viewPath: String = js.native
    def component(): Component = js.native
    def defaultVariant(): this.type = js.native
    def getContent(): js.Promise[String] = js.native
    def getContentSync(): String = js.native
    def getPreviewContent(): js.Promise[String] = js.native
    def getPreviewContext(): js.Promise[_] = js.native
    def render(context: js.Any): js.Promise[String] = js.native
    def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
    def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
    def resources(): AssetCollection = js.native
    def resourcesJSON(): js.Object = js.native
    def variant(): this.type = js.native
  }
  
  @js.native
  trait VariantCollection extends EntityCollection[Variant] {
    val referencedBy: js.Array[_] = js.native
    val references: js.Array[_] = js.native
    def default(): Variant = js.native
    def getCOllatedContext(): js.Promise[_] = js.native
    def getCollatedContent(): js.Promise[String] = js.native
    def getCollatedContentSync(): String = js.native
  }
  
  /* static members */
  @js.native
  object Variant extends js.Object {
    def create(config: js.Object, view: js.Any, resources: AssetCollection, parent: Component): Variant = js.native
  }
  
}

