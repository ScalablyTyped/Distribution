package typings.diff2html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sideBySideRendererMod {
  
  type DiffLineGroups = js.Array[
    js.Tuple3[
      js.Array[
        typings.diff2html.typesMod.DiffLineContext with typings.diff2html.typesMod.DiffLineContent
      ], 
      js.Array[
        typings.diff2html.typesMod.DiffLineDeleted with typings.diff2html.typesMod.DiffLineContent
      ], 
      js.Array[
        typings.diff2html.typesMod.DiffLineInserted with typings.diff2html.typesMod.DiffLineContent
      ]
    ]
  ]
}
