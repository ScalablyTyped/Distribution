package typings.frctlFractal.mod.fractal.api.components

import typings.frctlFractal.anon.Alias
import typings.frctlFractal.mod.fractal.api.files.File
import typings.frctlFractal.mod.fractal.api.files.FileCollection
import typings.frctlFractal.mod.fractal.core.entities.Entity
import typings.frctlFractal.mod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentSource extends EntitySource[Component, ComponentConfig] {
  
  def components(): js.Array[Component] = js.native
  
  def find(): js.Any = js.native
  
  def findFile(filePath: String): js.UndefOr[File] = js.native
  
  def getReferencesOf(target: Alias): js.Array[_] = js.native
  
  def render(entity: String, context: js.Any): js.Promise[String] = js.native
  def render(entity: String, context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
  def render(entity: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
  def render(entity: String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
  def render(entity: Entity, context: js.Any): js.Promise[String] = js.native
  def render(entity: Entity, context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
  def render(entity: Entity, context: js.Any, env: js.Any): js.Promise[String] = js.native
  def render(entity: Entity, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
  
  def renderPreview(entity: String): js.Promise[String] = js.native
  def renderPreview(entity: String, preview: js.UndefOr[scala.Nothing], env: js.Any): js.Promise[String] = js.native
  def renderPreview(entity: String, preview: Boolean): js.Promise[String] = js.native
  def renderPreview(entity: String, preview: Boolean, env: js.Any): js.Promise[String] = js.native
  def renderPreview(entity: Entity): js.Promise[String] = js.native
  def renderPreview(entity: Entity, preview: js.UndefOr[scala.Nothing], env: js.Any): js.Promise[String] = js.native
  def renderPreview(entity: Entity, preview: Boolean): js.Promise[String] = js.native
  def renderPreview(entity: Entity, preview: Boolean, env: js.Any): js.Promise[String] = js.native
  
  def renderString(str: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
  
  def resolve(context: js.Any): js.Any = js.native
  
  def resources(): FileCollection = js.native
  
  def variants(): this.type = js.native
}
