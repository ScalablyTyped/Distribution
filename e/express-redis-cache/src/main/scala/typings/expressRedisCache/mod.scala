package typings.expressRedisCache

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.eventsMod.EventEmitter
import typings.redis.mod.RedisClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-redis-cache", JSImport.Namespace)
  @js.native
  def apply(): ExpressRedisCache = js.native
  @JSImport("express-redis-cache", JSImport.Namespace)
  @js.native
  def apply(options: Options): ExpressRedisCache = js.native
  
  @JSImport("express-redis-cache", "ExpressRedisCache")
  @js.native
  class ExpressRedisCache () extends EventEmitter {
    def this(options: Options) = this()
    
    val FOREVER: Double = js.native
    
    def add(name: String, body: String, callback: js.Function2[/* error */ js.Any, /* added */ Entry, Unit]): Unit = js.native
    def add(
      name: String,
      body: String,
      options: AddOptions,
      callback: js.Function2[/* error */ js.Any, /* added */ Entry, Unit]
    ): Unit = js.native
    
    var auth_pass: String = js.native
    
    var client: RedisClient = js.native
    
    var connected: Boolean = js.native
    
    def del(name: String, callback: js.Function2[/* error */ js.Any, /* deleted */ Double, Unit]): Unit = js.native
    
    var expire: Double = js.native
    
    def get(callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], Unit]): Unit = js.native
    def get(name: String, callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], Unit]): Unit = js.native
    
    var host: String = js.native
    
    var options: Options = js.native
    
    var port: String | Double = js.native
    
    var prefix: String = js.native
    
    def route(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def route(expire: Double): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def route(nameOrOptions: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def route(nameOrOptions: String, expire: ExpireOption): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def route(nameOrOptions: RouteOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def route(nameOrOptions: RouteOptions, expire: ExpireOption): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def size(callback: js.Function2[/* error */ js.Any, /* bytes */ Double, Unit]): Unit = js.native
  }
  object ExpressRedisCache {
    
    /* static member */
    @JSImport("express-redis-cache", "ExpressRedisCache.init")
    @js.native
    def init(): ExpressRedisCache = js.native
    @JSImport("express-redis-cache", "ExpressRedisCache.init")
    @js.native
    def init(options: Options): ExpressRedisCache = js.native
  }
  
  @js.native
  trait AddOptions extends StObject {
    
    var expire: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object AddOptions {
    
    @scala.inline
    def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    @scala.inline
    implicit class AddOptionsMutableBuilder[Self <: AddOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Entry extends StObject {
    
    var body: String = js.native
    
    var expire: Double = js.native
    
    var touched: Double = js.native
    
    var `type`: String = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(body: String, expire: Double, touched: Double, `type`: String): Entry = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouched(value: Double): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ExpirationConfig = StringDictionary[Double]
  
  type ExpirationPolicy = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    Double
  ]
  
  type ExpireOption = Double | ExpirationConfig
  
  @js.native
  trait Options extends StObject {
    
    var auth_pass: js.UndefOr[String] = js.native
    
    var client: js.UndefOr[RedisClient] = js.native
    
    var expire: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[String | Double] = js.native
    
    var prefix: js.UndefOr[String] = js.native
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
      def setAuth_pass(value: String): Self = StObject.set(x, "auth_pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_passUndefined: Self = StObject.set(x, "auth_pass", js.undefined)
      
      @scala.inline
      def setClient(value: RedisClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait RouteOptions extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.native
    
    var expire: js.UndefOr[ExpireOption | ExpirationPolicy] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object RouteOptions {
    
    @scala.inline
    def apply(): RouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setExpire(value: ExpireOption | ExpirationPolicy): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireFunction2(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Double
      ): Self = StObject.set(x, "expire", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Response extends StObject {
      
      var express_redis_cache_name: js.UndefOr[String] = js.native
      
      var use_express_redis_cache: js.UndefOr[Boolean] = js.native
    }
    object Response {
      
      @scala.inline
      def apply(): Response = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Response]
      }
      
      @scala.inline
      implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExpress_redis_cache_name(value: String): Self = StObject.set(x, "express_redis_cache_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpress_redis_cache_nameUndefined: Self = StObject.set(x, "express_redis_cache_name", js.undefined)
        
        @scala.inline
        def setUse_express_redis_cache(value: Boolean): Self = StObject.set(x, "use_express_redis_cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUse_express_redis_cacheUndefined: Self = StObject.set(x, "use_express_redis_cache", js.undefined)
      }
    }
  }
}
