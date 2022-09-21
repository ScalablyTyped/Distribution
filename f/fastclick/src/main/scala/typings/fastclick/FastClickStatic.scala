package typings.fastclick

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastClickStatic
  extends StObject
     with Instantiable1[/* layer */ Any, FastClickObject]
     with Instantiable2[/* layer */ Any, /* options */ FastClickOptions, FastClickObject] {
  
  def attach(layer: Any): FastClickObject = js.native
  def attach(layer: Any, options: FastClickOptions): FastClickObject = js.native
}
