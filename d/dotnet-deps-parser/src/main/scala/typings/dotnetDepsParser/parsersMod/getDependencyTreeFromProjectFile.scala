package typings.dotnetDepsParser.parsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotnet-deps-parser/dist/parsers", "getDependencyTreeFromProjectFile")
@js.native
object getDependencyTreeFromProjectFile extends js.Object {
  def apply(manifestFile: js.Any): js.Promise[PkgTree] = js.native
  def apply(manifestFile: js.Any, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def apply(manifestFile: js.Any, includeDev: Boolean, propsMap: PropsLookup): js.Promise[PkgTree] = js.native
}

