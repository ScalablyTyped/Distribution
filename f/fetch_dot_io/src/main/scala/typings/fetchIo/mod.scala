package typings.fetchIo

import org.scalablytyped.runtime.StringDictionary
import typings.fetchIo.fetchIoStrings.form
import typings.fetchIo.fetchIoStrings.json
import typings.fetchIo.fetchIoStrings.urlencoded
import typings.std.BodyInit
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fetch.io", JSImport.Default)
  @js.native
  class default () extends Request {
    def this(options: Options) = this()
  }
  
  @JSImport("fetch.io", "Request")
  @js.native
  class Request protected () extends StObject {
    def this(method: TMethod, url: TUrl, options: Options) = this()
    
    /**
      * append formData
      */
    def append(key: String, value: js.Any): this.type = js.native
    def append(`object`: StringDictionary[js.Any]): this.type = js.native
    
    /**
      * Set Options
      */
    def config(key: String, value: js.Any): this.type = js.native
    def config(opts: StringDictionary[js.Any]): this.type = js.native
    
    /**
      * HTTP delete method
      */
    def delete(url: TUrl): this.type = js.native
    
    /**
      * HTTP get method
      */
    def get(url: TUrl): this.type = js.native
    
    /**
      * HTTP head method
      */
    def head(url: TUrl): this.type = js.native
    
    /**
      * Make Response to JSON
      */
    def json(): js.Promise[_] = js.native
    def json(strict: Boolean): js.Promise[_] = js.native
    
    /**
      * HTTP options method
      */
    def options(url: TUrl): this.type = js.native
    
    /**
      * HTTP patch method
      */
    def patch(url: TUrl): this.type = js.native
    
    /**
      * HTTP post method
      */
    def post(url: TUrl): this.type = js.native
    
    /**
      * HTTP put method
      */
    def put(url: TUrl): this.type = js.native
    
    /**
      * Add query string
      */
    def query(`object`: StringDictionary[js.Any]): this.type = js.native
    
    /**
      * Send data
      */
    def send(data: StringDictionary[js.Any]): this.type = js.native
    
    /**
      * Set Header
      */
    def set(key: String, value: js.Any): this.type = js.native
    def set(opts: StringDictionary[js.Any]): this.type = js.native
    
    /**
      * Make Response to string
      */
    def text(): js.Promise[String] = js.native
    
    /**
      * Get Response directly
      */
    def `then`(resolve: js.Function1[/* value */ js.UndefOr[Response], Unit]): js.Promise[_] = js.native
    def `then`(
      resolve: js.Function1[/* value */ js.UndefOr[Response], Unit],
      reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
    ): js.Promise[_] = js.native
    
    @JSName("type")
    def type_form(`type`: form): this.type = js.native
    /**
      * Set Content-Type
      */
    @JSName("type")
    def type_json(`type`: json): this.type = js.native
    @JSName("type")
    def type_urlencoded(`type`: urlencoded): this.type = js.native
  }
  
  type Fetch = Request
  
  type Header = StringDictionary[String]
  
  @js.native
  trait Options extends RequestInit {
    
    var afterJSON: js.UndefOr[js.Function1[/* body */ js.Any, Unit]] = js.native
    
    var afterResponse: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.native
    
    var beforeRequest: js.UndefOr[js.Function2[/* url */ TUrl, /* body */ BodyInit, Boolean | Unit]] = js.native
    
    var header: js.UndefOr[Header] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var query: js.UndefOr[Query] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterJSON(value: /* body */ js.Any => Unit): Self = StObject.set(x, "afterJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterJSONUndefined: Self = StObject.set(x, "afterJSON", js.undefined)
      
      @scala.inline
      def setAfterResponse(value: /* res */ Response => Unit): Self = StObject.set(x, "afterResponse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterResponseUndefined: Self = StObject.set(x, "afterResponse", js.undefined)
      
      @scala.inline
      def setBeforeRequest(value: (/* url */ TUrl, /* body */ BodyInit) => Boolean | Unit): Self = StObject.set(x, "beforeRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
      
      @scala.inline
      def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type Query = StringDictionary[Double | Boolean | String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fetchIo.fetchIoStrings.delete
    - typings.fetchIo.fetchIoStrings.get
    - typings.fetchIo.fetchIoStrings.head
    - typings.fetchIo.fetchIoStrings.options
    - typings.fetchIo.fetchIoStrings.post
    - typings.fetchIo.fetchIoStrings.put
  */
  trait TMethod extends StObject
  object TMethod {
    
    @scala.inline
    def delete: typings.fetchIo.fetchIoStrings.delete = "delete".asInstanceOf[typings.fetchIo.fetchIoStrings.delete]
    
    @scala.inline
    def get: typings.fetchIo.fetchIoStrings.get = "get".asInstanceOf[typings.fetchIo.fetchIoStrings.get]
    
    @scala.inline
    def head: typings.fetchIo.fetchIoStrings.head = "head".asInstanceOf[typings.fetchIo.fetchIoStrings.head]
    
    @scala.inline
    def options: typings.fetchIo.fetchIoStrings.options = "options".asInstanceOf[typings.fetchIo.fetchIoStrings.options]
    
    @scala.inline
    def post: typings.fetchIo.fetchIoStrings.post = "post".asInstanceOf[typings.fetchIo.fetchIoStrings.post]
    
    @scala.inline
    def put: typings.fetchIo.fetchIoStrings.put = "put".asInstanceOf[typings.fetchIo.fetchIoStrings.put]
  }
  
  type TUrl = String
}
