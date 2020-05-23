package typings.dotnetDepsParser.parsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotnet-deps-parser/dist/parsers", "getDependencyTreeFromProjectJson")
@js.native
object getDependencyTreeFromProjectJson extends js.Object {
  def apply(manifestFile: ProjectJsonManifest): PkgTree = js.native
  def apply(manifestFile: ProjectJsonManifest, includeDev: Boolean): PkgTree = js.native
}

