package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.html
  *
  *
  */
trait GoogleSearchStore extends js.Object {
  /**
    *
    */
  def BlogSearch(): Unit
  /**
    *
    */
  def BookSearch(): Unit
  /**
    *
    */
  def ImageSearch(): Unit
  /**
    *
    */
  def LocalSearch(): Unit
  /**
    *
    */
  def NewsSearch(): Unit
  /**
    *
    */
  def Search(): Unit
  /**
    *
    */
  def VideoSearch(): Unit
  /**
    *
    */
  def WebSearch(): Unit
}

@JSGlobal("dojox.data.GoogleSearchStore")
@js.native
object GoogleSearchStore extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.BlogSearch.html
    *
    * A data store for retrieving search results from Google.
    * The following attributes are supported on each item:
    *
    * title - The blog post title in HTML format.
    * titleNoFormatting - The  blog post title in plain text
    * content - A snippet of information about the blog post
    * blogUrl - The URL for the blog
    * postUrl - The URL for the a single blog post
    * visibleUrl - The URL with no protocol specified.
    * cacheUrl - The URL to the copy of the document cached by Google
    * author - The author of the blog post
    * publishedDate - The published date, in RFC-822 format
    * The query accepts one parameter: text - The string to search for
    *
    * @param args
    */
  @js.native
  class BlogSearch protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.BookSearch.html
    *
    * A data store for retrieving search results from Google.
    * The following attributes are supported on each item:
    *
    * title - The book title in HTML format.
    * titleNoFormatting - The book title in plain text
    * authors - An array of authors
    * url - The URL for the item
    * unescapedUrl - The URL for the item, with URL escaping. This is often more readable
    * bookId - An identifier for the book, usually an ISBN.
    * pageCount - The number of pages in the book.
    * publishedYear - The year of publication.
    * The query accepts one parameter: text - The string to search for
    *
    * @param args
    */
  @js.native
  class BookSearch protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.ImageSearch.html
    *
    * A data store for retrieving search results from Google.
    * The following attributes are supported on each item:
    *
    * title - The image title in HTML format.
    * titleNoFormatting - The image title in plain text
    * url - The URL for the image
    * unescapedUrl - The URL for the image, with URL escaping. This is often more readable
    * tbUrl - The URL for the image thumbnail
    * visibleUrl - A shortened version of the URL associated with the result, stripped of a protocol and path
    * originalContextUrl - The URL of the page containing the image.
    * width - The width of the image in pixels.
    * height - The height of the image in pixels.
    * tbWidth - The width of the image thumbnail in pixels.
    * tbHeight - The height of the image thumbnail in pixels.
    * content - A snippet of information about the image, in HTML format
    * contentNoFormatting - A snippet of information about the image, in plain text
    * The query accepts one parameter: text - The string to search for
    *
    * @param args
    */
  @js.native
  class ImageSearch protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.LocalSearch.html
    *
    * A data store for retrieving search results from Google.
    * The following attributes are supported on each item:
    *
    * title - The blog post title in HTML format.
    * titleNoFormatting - The  blog post title in plain text
    * content - A snippet of information about the blog post
    * url - The URL for the item
    * lat - The latitude.
    * lng - The longtitude.
    * streetAddress - The street address
    * city - The city
    * region - The region
    * country - The country
    * phoneNumbers - Phone numbers associated with this address. Can be one or more.
    * ddUrl - A URL that can be used to provide driving directions from the center of the search results to this search results
    * ddUrlToHere - A URL that can be used to provide driving directions from this search result to a user specified location
    * staticMapUrl - The published date, in RFC-822 format
    * viewport - Recommended viewport for the query results (same for all results in a query)
    * center - contains lat, lng properties
    * span - lat, lng properties for the viewport span
    * ne, sw - lat, lng properties for the viewport corners
    *
    * The query accepts the following parameters:
    *
    * text - The string to search for
    * centerLatLong - Comma-separated lat & long for the center of the search (e.g. "48.8565,2.3509")
    * searchSpan - Comma-separated lat & long degrees indicating the size of the desired search area (e.g. "0.065165,0.194149")
    *
    * @param args
    */
  @js.native
  class LocalSearch protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.NewsSearch.html
    *
    * A data store for retrieving search results from Google.
    * The following attributes are supported on each item:
    *
    * title - The news story title in HTML format.
    * titleNoFormatting - The news story title in plain text
    * content - A snippet of information about the news story
    * url - The URL for the item
    * unescapedUrl - The URL for the item, with URL escaping. This is often more readable
    * publisher - The name of the publisher
    * clusterUrl - A URL pointing to a page listing related storied.
    * location - The location of the news story.
    * publishedDate - The date of publication, in RFC-822 format.
    * relatedStories - An optional array of objects specifying related stories.
    *   Each object has the following subset of properties:
    *   "title", "titleNoFormatting", "url", "unescapedUrl", "publisher", "location", "publishedDate".
    * The query accepts one parameter: text - The string to search for
    *
    * @param args
    */
  @js.native
  class NewsSearch protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.Search.html
    *
    * A data store for retrieving search results from Google.
    * This data store acts as a base class for Google searches,
    * and has a number of child data stores that implement different
    * searches. This store defaults to searching the web, and is functionally
    * identical to the dojox.data.GoogleWebSearchStore object.
    * The following attributes are supported on each item:
    *
    * url - The URL for the item
    * unescapedUrl - The URL for the item, with URL escaping. This is often more readable
    * visibleUrl - The URL with no protocol specified.
    * cacheUrl - The URL to the copy of the document cached by Google
    * title - The page title in HTML format.
    * titleNoFormatting - The page title in plain text
    * content - A snippet of information about the page
    * The query accepts one parameter: text - The string to search for
    *
    * @param args
    */
  @js.native
  class Search protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.VideoSearch.html
    *
    * A data store for retrieving search results from Google.
    * The following attributes are supported on each item:
    *
    * title - The blog post title in HTML format.
    * titleNoFormatting - The  blog post title in plain text
    * content - A snippet of information about the blog post
    * url - The URL for the item
    * published - The published date, in RFC-822 format.
    * publisher - The name of the publisher.
    * duration - The approximate duration, in seconds, of the video.
    * tbWidth - The width in pixels of the video.
    * tbHeight - The height in pixels of the video
    * tbUrl - The URL to a thumbnail representation of the video.
    * playUrl - If present, supplies the url of the flash version of the video that can be played inline on your page. To play this video simply create and  element on your page using this value as the src attribute and using application/x-shockwave-flash as the type attribute. If you want the video to play right away, make sure to append &autoPlay=true to the url..
    * The query accepts one parameter: text - The string to search for
    *
    * @param args
    */
  @js.native
  class VideoSearch protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleSearchStore.WebSearch.html
    *
    * A data store for retrieving search results from Google.
    * The following attributes are supported on each item:
    *
    * title - The page title in HTML format.
    * titleNoFormatting - The page title in plain text
    * content - A snippet of information about the page
    * url - The URL for the item
    * unescapedUrl - The URL for the item, with URL escaping. This is often more readable
    * visibleUrl - The URL with no protocol specified.
    * cacheUrl - The URL to the copy of the document cached by Google
    * estimatedResultCount - (aggregated per-query) estimated number of results
    * The query accepts one parameter: text - The string to search for
    *
    * @param args
    */
  @js.native
  class WebSearch protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      * The default attribute which acts as a label for each item.
      *
      */
    var label: String = js.native
    /**
      * Sets whether or not to pass preventCache to dojo.io.script.
      *
      */
    var urlPreventCache: Boolean = js.native
    /**
      * See dojo/data/api/Read.close()
      *
      * @param request
      */
    def close(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.containsValue()
      *
      * @param item
      * @param attribute
      * @param value
      */
    def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
    /**
      * Fetch Google search items that match to a query
      *
      * @param request A request object
      */
    def fetch(request: js.Any): Unit = js.native
    /**
      * See dojo/data/api/Read.getAttributes()
      *
      * @param item
      */
    def getAttributes(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getFeatures()
      *
      */
    def getFeatures(): js.Object = js.native
    /**
      * See dojo/data/api/Read.getLabel()
      *
      * @param item
      */
    def getLabel(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getLabelAttributes()
      *
      * @param item
      */
    def getLabelAttributes(item: js.Any): js.Array[_] = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      * @param defaultValue
      */
    def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.getValue()
      *
      * @param item
      * @param attribute
      */
    def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.hasAttributes()
      *
      * @param item
      * @param attribute
      */
    def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItem()
      *
      * @param item
      */
    def isItem(item: js.Any): Boolean = js.native
    /**
      * See dojo/data/api/Read.isItemLoaded()
      *
      * @param item
      */
    def isItemLoaded(item: js.Any): js.Any = js.native
    /**
      * See dojo/data/api/Read.loadItem()
      *
      * @param keywordArgs
      */
    def loadItem(keywordArgs: js.Any): Unit = js.native
  }
  
}

