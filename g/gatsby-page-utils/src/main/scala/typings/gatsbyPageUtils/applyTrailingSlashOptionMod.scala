package typings.gatsbyPageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyTrailingSlashOptionMod {
  
  @JSImport("gatsby-page-utils/dist/apply-trailing-slash-option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyTrailingSlashOption(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTrailingSlashOption")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def applyTrailingSlashOption(input: String, option: TrailingSlash): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTrailingSlashOption")(input.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyPageUtils.gatsbyPageUtilsStrings.always
    - typings.gatsbyPageUtils.gatsbyPageUtilsStrings.never
    - typings.gatsbyPageUtils.gatsbyPageUtilsStrings.ignore
    - typings.gatsbyPageUtils.gatsbyPageUtilsStrings.legacy
  */
  trait TrailingSlash extends StObject
  object TrailingSlash {
    
    inline def always: typings.gatsbyPageUtils.gatsbyPageUtilsStrings.always = "always".asInstanceOf[typings.gatsbyPageUtils.gatsbyPageUtilsStrings.always]
    
    inline def ignore: typings.gatsbyPageUtils.gatsbyPageUtilsStrings.ignore = "ignore".asInstanceOf[typings.gatsbyPageUtils.gatsbyPageUtilsStrings.ignore]
    
    inline def legacy: typings.gatsbyPageUtils.gatsbyPageUtilsStrings.legacy = "legacy".asInstanceOf[typings.gatsbyPageUtils.gatsbyPageUtilsStrings.legacy]
    
    inline def never: typings.gatsbyPageUtils.gatsbyPageUtilsStrings.never = "never".asInstanceOf[typings.gatsbyPageUtils.gatsbyPageUtilsStrings.never]
  }
}
