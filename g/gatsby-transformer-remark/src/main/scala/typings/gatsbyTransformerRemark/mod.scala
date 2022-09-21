package typings.gatsbyTransformerRemark

import typings.gatsbyTransformerRemark.anon.Absolute
import typings.gatsbyTransformerRemark.gatsbyTransformerRemarkStrings.`gatsby-transformer-remark`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait RemarkConfig extends StObject {
    
    var options: js.UndefOr[RemarkOptions] = js.undefined
    
    var resolve: `gatsby-transformer-remark`
  }
  object RemarkConfig {
    
    inline def apply(): RemarkConfig = {
      val __obj = js.Dynamic.literal(resolve = "gatsby-transformer-remark")
      __obj.asInstanceOf[RemarkConfig]
    }
    
    extension [Self <: RemarkConfig](x: Self) {
      
      inline def setOptions(value: RemarkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResolve(value: `gatsby-transformer-remark`): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemarkOptions extends StObject {
    
    /** CommonMark mode (default: true) */
    var commonmark: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see https://www.gatsbyjs.com/plugins/gatsby-transformer-remark/#example-excerpts
      */
    var excerpt_separator: js.UndefOr[String] = js.undefined
    
    /** Footnotes mode (default: true) */
    var footnotes: js.UndefOr[Boolean] = js.undefined
    
    /** GitHub Flavored Markdown mode (default: true) */
    var gfm: js.UndefOr[Boolean] = js.undefined
    
    /** Pedantic mode (default: true) */
    var pedantic: js.UndefOr[Boolean] = js.undefined
    
    /** Plugins configs */
    var plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Pass default options to the plugin generating tableOfContents
      * @see https://www.gatsbyjs.com/plugins/gatsby-transformer-remark/#configuring-the-tableofcontents
      */
    var tableOfContents: js.UndefOr[Absolute] = js.undefined
  }
  object RemarkOptions {
    
    inline def apply(): RemarkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemarkOptions]
    }
    
    extension [Self <: RemarkOptions](x: Self) {
      
      inline def setCommonmark(value: Boolean): Self = StObject.set(x, "commonmark", value.asInstanceOf[js.Any])
      
      inline def setCommonmarkUndefined: Self = StObject.set(x, "commonmark", js.undefined)
      
      inline def setExcerpt_separator(value: String): Self = StObject.set(x, "excerpt_separator", value.asInstanceOf[js.Any])
      
      inline def setExcerpt_separatorUndefined: Self = StObject.set(x, "excerpt_separator", js.undefined)
      
      inline def setFootnotes(value: Boolean): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      inline def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
      
      inline def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      inline def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
      
      inline def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
      
      inline def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setTableOfContents(value: Absolute): Self = StObject.set(x, "tableOfContents", value.asInstanceOf[js.Any])
      
      inline def setTableOfContentsUndefined: Self = StObject.set(x, "tableOfContents", js.undefined)
    }
  }
}
