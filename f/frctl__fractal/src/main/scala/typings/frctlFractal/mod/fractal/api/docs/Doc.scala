package typings.frctlFractal.mod.fractal.api.docs

import typings.frctlFractal.frctlFractalBooleans.`true`
import typings.frctlFractal.mod.fractal.core.entities.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal.api.docs.Doc")
@js.native
class Doc protected () extends Entity {
  def this(config: js.Any, content: String, parent: Entity) = this()
  val isAsset: js.UndefOr[scala.Nothing] = js.native
  @JSName("isCollection")
  val isCollection_Doc: js.UndefOr[scala.Nothing] = js.native
  @JSName("isComponent")
  val isComponent_Doc: js.UndefOr[scala.Nothing] = js.native
  @JSName("isDoc")
  val isDoc_Doc: `true` = js.native
  val isFile: js.UndefOr[scala.Nothing] = js.native
  val isIndex: Boolean = js.native
  @JSName("isVariant")
  val isVariant_Doc: js.UndefOr[scala.Nothing] = js.native
  def getContent(): js.Promise[String] = js.native
  def getContentSync(): String = js.native
  def render(context: js.Any): js.Promise[String] = js.native
  def render(context: js.Any, env: js.Any): js.Promise[String] = js.native
  def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
  def toc(): js.Promise[String] = js.native
  def toc(maxDepth: Double): js.Promise[String] = js.native
}

/* static members */
@JSImport("@frctl/fractal", "fractal.api.docs.Doc")
@js.native
object Doc extends js.Object {
  def create(config: js.Any, content: String, parent: Entity): Doc = js.native
}

