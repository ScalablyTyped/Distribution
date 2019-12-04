package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemovedFiles extends js.Object {
  var removedFiles: js.Array[String]
  var results: js.Array[Diagnostic]
  var updatedFiles: js.Array[String]
}

object Anon_RemovedFiles {
  @scala.inline
  def apply(removedFiles: js.Array[String], results: js.Array[Diagnostic], updatedFiles: js.Array[String]): Anon_RemovedFiles = {
    val __obj = js.Dynamic.literal(removedFiles = removedFiles.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], updatedFiles = updatedFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RemovedFiles]
  }
}

