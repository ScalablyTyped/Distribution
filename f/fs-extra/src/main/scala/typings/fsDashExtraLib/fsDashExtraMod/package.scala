package typings
package fsDashExtraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashExtraMod {
  type CopyFilterAsync = js.Function2[
    /* src */ java.lang.String, 
    /* dest */ java.lang.String, 
    stdLib.Promise[scala.Boolean]
  ]
  type CopyFilterSync = js.Function2[/* src */ java.lang.String, /* dest */ java.lang.String, scala.Boolean]
  type FsSymlinkType = fsDashExtraLib.fsDashExtraLibStrings.dir | fsDashExtraLib.fsDashExtraLibStrings.file | fsDashExtraLib.fsDashExtraLibStrings.junction
  type SymlinkType = fsDashExtraLib.fsDashExtraLibStrings.dir | fsDashExtraLib.fsDashExtraLibStrings.file
}
