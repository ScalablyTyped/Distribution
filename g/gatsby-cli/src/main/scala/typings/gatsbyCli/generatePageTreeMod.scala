package typings.gatsbyCli

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatePageTreeMod {
  
  @JSImport("gatsby-cli/lib/util/generate-page-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePageTree(collections: IComponentWithPageModes): js.Array[IPageTreeLine] = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePageTree")(collections.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPageTreeLine]]
  inline def generatePageTree(collections: IComponentWithPageModes, LIMIT: Double): js.Array[IPageTreeLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePageTree")(collections.asInstanceOf[js.Any], LIMIT.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPageTreeLine]]
  
  trait IComponentWithPageModes extends StObject {
    
    var DSG: Set[String]
    
    var FN: Set[String]
    
    var SSG: Set[String]
    
    var SSR: Set[String]
  }
  object IComponentWithPageModes {
    
    inline def apply(DSG: Set[String], FN: Set[String], SSG: Set[String], SSR: Set[String]): IComponentWithPageModes = {
      val __obj = js.Dynamic.literal(DSG = DSG.asInstanceOf[js.Any], FN = FN.asInstanceOf[js.Any], SSG = SSG.asInstanceOf[js.Any], SSR = SSR.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComponentWithPageModes]
    }
    
    extension [Self <: IComponentWithPageModes](x: Self) {
      
      inline def setDSG(value: Set[String]): Self = StObject.set(x, "DSG", value.asInstanceOf[js.Any])
      
      inline def setFN(value: Set[String]): Self = StObject.set(x, "FN", value.asInstanceOf[js.Any])
      
      inline def setSSG(value: Set[String]): Self = StObject.set(x, "SSG", value.asInstanceOf[js.Any])
      
      inline def setSSR(value: Set[String]): Self = StObject.set(x, "SSR", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPageTreeLine extends StObject {
    
    var symbol: SYMBOLS
    
    var text: String
  }
  object IPageTreeLine {
    
    inline def apply(symbol: SYMBOLS, text: String): IPageTreeLine = {
      val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageTreeLine]
    }
    
    extension [Self <: IPageTreeLine](x: Self) {
      
      inline def setSymbol(value: SYMBOLS): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyCli.gatsbyCliStrings.Space
    - typings.gatsbyCli.gatsbyCliStrings.D
    - typings.gatsbyCli.gatsbyCliStrings.Infinity
    - typings.gatsbyCli.gatsbyCliStrings.λ
  */
  trait SYMBOLS extends StObject
  object SYMBOLS {
    
    inline def D: typings.gatsbyCli.gatsbyCliStrings.D = "D".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.D]
    
    inline def Infinity: typings.gatsbyCli.gatsbyCliStrings.Infinity = "\u221E".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.Infinity]
    
    inline def Space: typings.gatsbyCli.gatsbyCliStrings.Space = (" ").asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.Space]
    
    inline def λ: typings.gatsbyCli.gatsbyCliStrings.λ = "\u03BB".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.λ]
  }
}
