package typings.envify

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("envify", JSImport.Namespace)
  @js.native
  val ^ : js.Function2[
    /* file */ String, 
    /* environment */ StringDictionary[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ] = js.native
  
  type _To = js.Function2[
    /* file */ String, 
    /* environment */ StringDictionary[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function2[
    /* file */ String, 
    /* environment */ StringDictionary[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ] = ^
}
