package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The omnibox API allows you to register a keyword with Firefox's address bar.
  *
  * Manifest keys: `omnibox`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object omnibox {
  
  /** A suggest result. */
  trait DefaultSuggestResult extends StObject {
    
    /** The text that is displayed in the URL dropdown. */
    var description: String
    
    /**
      * An array of style ranges for the description, as provided by the extension.
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStyles: js.UndefOr[js.Array[DefaultSuggestResultDescriptionStyles]] = js.undefined
    
    /**
      * An array of style ranges for the description, as provided by ToValue().
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStylesRaw: js.UndefOr[js.Array[DefaultSuggestResultDescriptionStylesRaw]] = js.undefined
  }
  object DefaultSuggestResult {
    
    inline def apply(description: String): DefaultSuggestResult = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSuggestResult]
    }
    
    extension [Self <: DefaultSuggestResult](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionStyles(value: js.Array[DefaultSuggestResultDescriptionStyles]): Self = StObject.set(x, "descriptionStyles", value.asInstanceOf[js.Any])
      
      inline def setDescriptionStylesRaw(value: js.Array[DefaultSuggestResultDescriptionStylesRaw]): Self = StObject.set(x, "descriptionStylesRaw", value.asInstanceOf[js.Any])
      
      inline def setDescriptionStylesRawUndefined: Self = StObject.set(x, "descriptionStylesRaw", js.undefined)
      
      inline def setDescriptionStylesRawVarargs(value: DefaultSuggestResultDescriptionStylesRaw*): Self = StObject.set(x, "descriptionStylesRaw", js.Array(value :_*))
      
      inline def setDescriptionStylesUndefined: Self = StObject.set(x, "descriptionStyles", js.undefined)
      
      inline def setDescriptionStylesVarargs(value: DefaultSuggestResultDescriptionStyles*): Self = StObject.set(x, "descriptionStyles", js.Array(value :_*))
    }
  }
  
  /** The style ranges for the description, as provided by the extension. */
  trait DefaultSuggestResultDescriptionStyles extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var offset: Double
    
    /** The style type */
    var `type`: DescriptionStyleType
  }
  object DefaultSuggestResultDescriptionStyles {
    
    inline def apply(offset: Double, `type`: DescriptionStyleType): DefaultSuggestResultDescriptionStyles = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSuggestResultDescriptionStyles]
    }
    
    extension [Self <: DefaultSuggestResultDescriptionStyles](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: DescriptionStyleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** The style ranges for the description, as provided by ToValue(). */
  trait DefaultSuggestResultDescriptionStylesRaw extends StObject {
    
    var offset: Double
    
    var `type`: Double
  }
  object DefaultSuggestResultDescriptionStylesRaw {
    
    inline def apply(offset: Double, `type`: Double): DefaultSuggestResultDescriptionStylesRaw = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSuggestResultDescriptionStylesRaw]
    }
    
    extension [Self <: DefaultSuggestResultDescriptionStylesRaw](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* omnibox types */
  /** The style type. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match`
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim
  */
  trait DescriptionStyleType extends StObject
  object DescriptionStyleType {
    
    inline def dim: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim = "dim".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim]
    
    inline def `match`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match` = "match".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match`]
    
    inline def url: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
  }
  
  /**
    * The window disposition for the omnibox query. This is the recommended context to display results. For example, if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation should take place in a new selected tab.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab
  */
  trait OnInputEnteredDisposition extends StObject
  object OnInputEnteredDisposition {
    
    inline def currentTab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab = "currentTab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab]
    
    inline def newBackgroundTab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab = "newBackgroundTab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab]
    
    inline def newForegroundTab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab = "newForegroundTab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab]
  }
  
  /** A suggest result. */
  trait SuggestResult extends StObject {
    
    /**
      * The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry.
      */
    var content: String
    
    /**
      * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. <dim><match>dimmed match</match></dim>. You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484
      */
    var description: String
    
    /**
      * An array of style ranges for the description, as provided by the extension.
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStyles: js.UndefOr[js.Array[SuggestResultDescriptionStyles]] = js.undefined
    
    /**
      * An array of style ranges for the description, as provided by ToValue().
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStylesRaw: js.UndefOr[js.Array[SuggestResultDescriptionStylesRaw]] = js.undefined
  }
  object SuggestResult {
    
    inline def apply(content: String, description: String): SuggestResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResult]
    }
    
    extension [Self <: SuggestResult](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionStyles(value: js.Array[SuggestResultDescriptionStyles]): Self = StObject.set(x, "descriptionStyles", value.asInstanceOf[js.Any])
      
      inline def setDescriptionStylesRaw(value: js.Array[SuggestResultDescriptionStylesRaw]): Self = StObject.set(x, "descriptionStylesRaw", value.asInstanceOf[js.Any])
      
      inline def setDescriptionStylesRawUndefined: Self = StObject.set(x, "descriptionStylesRaw", js.undefined)
      
      inline def setDescriptionStylesRawVarargs(value: SuggestResultDescriptionStylesRaw*): Self = StObject.set(x, "descriptionStylesRaw", js.Array(value :_*))
      
      inline def setDescriptionStylesUndefined: Self = StObject.set(x, "descriptionStyles", js.undefined)
      
      inline def setDescriptionStylesVarargs(value: SuggestResultDescriptionStyles*): Self = StObject.set(x, "descriptionStyles", js.Array(value :_*))
    }
  }
  
  /** The style ranges for the description, as provided by the extension. */
  trait SuggestResultDescriptionStyles extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var offset: Double
    
    /** The style type */
    var `type`: DescriptionStyleType
  }
  object SuggestResultDescriptionStyles {
    
    inline def apply(offset: Double, `type`: DescriptionStyleType): SuggestResultDescriptionStyles = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResultDescriptionStyles]
    }
    
    extension [Self <: SuggestResultDescriptionStyles](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: DescriptionStyleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** The style ranges for the description, as provided by ToValue(). */
  trait SuggestResultDescriptionStylesRaw extends StObject {
    
    var offset: Double
    
    var `type`: Double
  }
  object SuggestResultDescriptionStylesRaw {
    
    inline def apply(offset: Double, `type`: Double): SuggestResultDescriptionStylesRaw = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResultDescriptionStylesRaw]
    }
    
    extension [Self <: SuggestResultDescriptionStylesRaw](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
