package typings.ethersprojectContracts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContractFunction[T] = js.Function1[/* repeated */ js.Any, js.Promise[T]]
  
  type ContractInterface = java.lang.String | (js.Array[
    typings.ethersprojectAbi.mod.Fragment | typings.ethersprojectAbi.fragmentsMod.JsonFragment | java.lang.String
  ]) | typings.ethersprojectAbi.mod.Interface
}
