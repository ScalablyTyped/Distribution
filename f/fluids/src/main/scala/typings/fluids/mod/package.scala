package typings.fluids

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FluidProps[T] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | fluids.fluids.FluidValue<std.Exclude<T[P], void>, any>}
    */ typings.fluids.fluidsStrings.FluidProps with org.scalablytyped.runtime.TopLevel[js.Any])
  
  type GetFluidConfig_[T] = js.UndefOr[typings.fluids.mod.FluidConfig[js.Any, js.Any]]
}
