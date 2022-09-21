package typings.googleapis.anon

import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallPathOptions extends StObject {
  
  def apply(path: PathLike): js.UndefOr[String] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): scala.Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
}
