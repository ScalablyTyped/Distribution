package typings.ethereumjsVm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type PrecompileFunc = js.Function1[
    /* opts */ typings.ethereumjsVm.typesMod.PrecompileInput, 
    typings.ethereumjsVm.evmMod.ExecResult
  ]
}
