package typings.extractFiles.mod

import typings.extractFiles.anon.Clone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("extract-files", "extractFiles")
@js.native
object extractFiles extends js.Object {
  def apply[TFile](value: js.Any): Clone[TFile] = js.native
  def apply[TFile](
    value: js.Any,
    path: js.UndefOr[scala.Nothing],
    isExtractableFile: js.Function1[/* value */ js.Any, /* is TFile */ Boolean]
  ): Clone[TFile] = js.native
  def apply[TFile](value: js.Any, path: String): Clone[TFile] = js.native
  def apply[TFile](
    value: js.Any,
    path: String,
    isExtractableFile: js.Function1[/* value */ js.Any, /* is TFile */ Boolean]
  ): Clone[TFile] = js.native
}

