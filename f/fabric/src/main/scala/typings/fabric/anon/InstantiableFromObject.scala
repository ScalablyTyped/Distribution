package typings.fabric.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.fabric.fabricImplMod.IBlendImageFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstantiableFromObject
  extends StObject
     with /**
  * Constructor
  * @param [options] Options object
  */
Instantiable0[IBlendImageFilter]
     with Instantiable1[/* options */ Image, IBlendImageFilter] {
  
  /**
    * Returns filter instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: js.Any): IBlendImageFilter = js.native
}
