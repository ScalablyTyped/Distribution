package typings.fastJsonPatch.coreMod

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.TopLevel
import typings.fastJsonPatch.helpersMod.JsonPatchErrorName
import typings.fastJsonPatch.helpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-json-patch/commonjs/core", "JsonPatchError")
@js.native
object JsonPatchError
  extends TopLevel[
      Instantiable5[
        /* message */ String, 
        /* name */ JsonPatchErrorName, 
        /* index */ js.UndefOr[Double], 
        /* operation */ js.UndefOr[js.Any], 
        /* tree */ js.UndefOr[js.Any], 
        PatchError
      ]
    ]
