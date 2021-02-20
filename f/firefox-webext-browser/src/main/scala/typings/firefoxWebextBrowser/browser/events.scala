package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.events` namespace contains common types used by APIs dispatching events to notify you when something interesting happens.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object events {
  
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  @js.native
  trait Event extends StObject {
    
    /**
      * Registers an event listener _callback_ to an event.
      * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
      */
    def addListener(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Registers rules to handle events.
      * @param eventName Name of the event this function affects.
      * @param webViewInstanceId If provided, this is an integer that uniquely identfies the <webview> associated with this function call.
      * @param rules Rules to be registered. These do not replace previously registered rules.
      * @deprecated Unsupported on Firefox at this time.
      */
    var addRules: js.UndefOr[
        js.Function3[
          /* eventName */ String, 
          /* webViewInstanceId */ Double, 
          /* rules */ js.Array[Rule], 
          js.Promise[js.Array[Rule]]
        ]
      ] = js.native
    
    /**
      * Returns currently registered rules.
      * @param eventName Name of the event this function affects.
      * @param webViewInstanceId If provided, this is an integer that uniquely identfies the <webview> associated with this function call.
      * @param [ruleIdentifiers] If an array is passed, only rules with identifiers contained in this array are returned.
      * @deprecated Unsupported on Firefox at this time.
      */
    var getRules: js.UndefOr[
        js.Function3[
          /* eventName */ String, 
          /* webViewInstanceId */ Double, 
          /* ruleIdentifiers */ js.UndefOr[js.Array[String]], 
          js.Promise[js.Array[Rule]]
        ]
      ] = js.native
    
    /**
      * @param callback Listener whose registration status shall be tested.
      * @returns True if _callback_ is registered to the event.
      */
    def hasListener(callback: js.Function0[Unit]): Boolean = js.native
    
    /** @returns True if any event listeners are registered to the event. */
    def hasListeners(): Boolean = js.native
    
    /**
      * Deregisters an event listener _callback_ from an event.
      * @param callback Listener that shall be unregistered.
      */
    def removeListener(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Unregisters currently registered rules.
      * @param eventName Name of the event this function affects.
      * @param webViewInstanceId If provided, this is an integer that uniquely identfies the <webview> associated with this function call.
      * @param [ruleIdentifiers] If an array is passed, only rules with identifiers contained in this array are unregistered.
      * @deprecated Unsupported on Firefox at this time.
      */
    var removeRules: js.UndefOr[
        js.Function3[
          /* eventName */ String, 
          /* webViewInstanceId */ Double, 
          /* ruleIdentifiers */ js.UndefOr[js.Array[String]], 
          js.Promise[Unit]
        ]
      ] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(
      addListener: js.Function0[Unit] => Unit,
      hasListener: js.Function0[Unit] => Boolean,
      hasListeners: () => Boolean,
      removeListener: js.Function0[Unit] => Unit
    ): Event = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), hasListeners = js.Any.fromFunction0(hasListeners), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddRules(
        value: (/* eventName */ String, /* webViewInstanceId */ Double, /* rules */ js.Array[Rule]) => js.Promise[js.Array[Rule]]
      ): Self = StObject.set(x, "addRules", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddRulesUndefined: Self = StObject.set(x, "addRules", js.undefined)
      
      @scala.inline
      def setGetRules(
        value: (/* eventName */ String, /* webViewInstanceId */ Double, /* ruleIdentifiers */ js.UndefOr[js.Array[String]]) => js.Promise[js.Array[Rule]]
      ): Self = StObject.set(x, "getRules", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetRulesUndefined: Self = StObject.set(x, "getRules", js.undefined)
      
      @scala.inline
      def setHasListener(value: js.Function0[Unit] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasListeners(value: () => Boolean): Self = StObject.set(x, "hasListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveListener(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveRules(
        value: (/* eventName */ String, /* webViewInstanceId */ Double, /* ruleIdentifiers */ js.UndefOr[js.Array[String]]) => js.Promise[Unit]
      ): Self = StObject.set(x, "removeRules", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveRulesUndefined: Self = StObject.set(x, "removeRules", js.undefined)
    }
  }
  
  /* events types */
  /** Description of a declarative rule for handling events. */
  @js.native
  trait Rule extends StObject {
    
    /** List of actions that are triggered if one of the condtions is fulfilled. */
    var actions: js.Array[_] = js.native
    
    /** List of conditions that can trigger the actions. */
    var conditions: js.Array[_] = js.native
    
    /** Optional identifier that allows referencing this rule. */
    var id: js.UndefOr[String] = js.native
    
    /** Optional priority of this rule. Defaults to 100. */
    var priority: js.UndefOr[Double] = js.native
    
    /** Tags can be used to annotate rules and perform operations on sets of rules. */
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Rule {
    
    @scala.inline
    def apply(actions: js.Array[_], conditions: js.Array[_]): Rule = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[_]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: js.Any*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setConditions(value: js.Array[_]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionsVarargs(value: js.Any*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  /** Filters URLs for various criteria. See event filtering. All criteria are case sensitive. */
  @js.native
  trait UrlFilter extends StObject {
    
    /**
      * Matches if the host name of the URL contains a specified string. To test whether a host name component has a prefix 'foo', use hostContains: '.foo'. This matches 'www.foobar.com' and 'foo.com', because an implicit dot is added at the beginning of the host name. Similarly, hostContains can be used to match against component suffix ('foo.') and to exactly match against components ('.foo.'). Suffix- and exact-matching for the last components need to be done separately using hostSuffix, because no implicit dot is added at the end of the host name.
      */
    var hostContains: js.UndefOr[String] = js.native
    
    /** Matches if the host name of the URL is equal to a specified string. */
    var hostEquals: js.UndefOr[String] = js.native
    
    /** Matches if the host name of the URL starts with a specified string. */
    var hostPrefix: js.UndefOr[String] = js.native
    
    /** Matches if the host name of the URL ends with a specified string. */
    var hostSuffix: js.UndefOr[String] = js.native
    
    /**
      * Matches if the URL without query segment and fragment identifier matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the [RE2 syntax](https://github.com/google/re2/blob/master/doc/syntax.txt).
      */
    var originAndPathMatches: js.UndefOr[String] = js.native
    
    /** Matches if the path segment of the URL contains a specified string. */
    var pathContains: js.UndefOr[String] = js.native
    
    /** Matches if the path segment of the URL is equal to a specified string. */
    var pathEquals: js.UndefOr[String] = js.native
    
    /** Matches if the path segment of the URL starts with a specified string. */
    var pathPrefix: js.UndefOr[String] = js.native
    
    /** Matches if the path segment of the URL ends with a specified string. */
    var pathSuffix: js.UndefOr[String] = js.native
    
    /**
      * Matches if the port of the URL is contained in any of the specified port lists. For example `[80, 443, [1000, 1200]]` matches all requests on port 80, 443 and in the range 1000-1200.
      */
    var ports: js.UndefOr[js.Array[Double | (js.Tuple2[Double, Double])]] = js.native
    
    /** Matches if the query segment of the URL contains a specified string. */
    var queryContains: js.UndefOr[String] = js.native
    
    /** Matches if the query segment of the URL is equal to a specified string. */
    var queryEquals: js.UndefOr[String] = js.native
    
    /** Matches if the query segment of the URL starts with a specified string. */
    var queryPrefix: js.UndefOr[String] = js.native
    
    /** Matches if the query segment of the URL ends with a specified string. */
    var querySuffix: js.UndefOr[String] = js.native
    
    /** Matches if the scheme of the URL is equal to any of the schemes specified in the array. */
    var schemes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if they match the default port number.
      */
    var urlContains: js.UndefOr[String] = js.native
    
    /**
      * Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL if they match the default port number.
      */
    var urlEquals: js.UndefOr[String] = js.native
    
    /**
      * Matches if the URL (without fragment identifier) matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the [RE2 syntax](https://github.com/google/re2/blob/master/doc/syntax.txt).
      */
    var urlMatches: js.UndefOr[String] = js.native
    
    /**
      * Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL if they match the default port number.
      */
    var urlPrefix: js.UndefOr[String] = js.native
    
    /**
      * Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if they match the default port number.
      */
    var urlSuffix: js.UndefOr[String] = js.native
  }
  object UrlFilter {
    
    @scala.inline
    def apply(): UrlFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlFilter]
    }
    
    @scala.inline
    implicit class UrlFilterMutableBuilder[Self <: UrlFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostContains(value: String): Self = StObject.set(x, "hostContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostContainsUndefined: Self = StObject.set(x, "hostContains", js.undefined)
      
      @scala.inline
      def setHostEquals(value: String): Self = StObject.set(x, "hostEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostEqualsUndefined: Self = StObject.set(x, "hostEquals", js.undefined)
      
      @scala.inline
      def setHostPrefix(value: String): Self = StObject.set(x, "hostPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostPrefixUndefined: Self = StObject.set(x, "hostPrefix", js.undefined)
      
      @scala.inline
      def setHostSuffix(value: String): Self = StObject.set(x, "hostSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostSuffixUndefined: Self = StObject.set(x, "hostSuffix", js.undefined)
      
      @scala.inline
      def setOriginAndPathMatches(value: String): Self = StObject.set(x, "originAndPathMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginAndPathMatchesUndefined: Self = StObject.set(x, "originAndPathMatches", js.undefined)
      
      @scala.inline
      def setPathContains(value: String): Self = StObject.set(x, "pathContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathContainsUndefined: Self = StObject.set(x, "pathContains", js.undefined)
      
      @scala.inline
      def setPathEquals(value: String): Self = StObject.set(x, "pathEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathEqualsUndefined: Self = StObject.set(x, "pathEquals", js.undefined)
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      @scala.inline
      def setPathSuffix(value: String): Self = StObject.set(x, "pathSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSuffixUndefined: Self = StObject.set(x, "pathSuffix", js.undefined)
      
      @scala.inline
      def setPorts(value: js.Array[Double | (js.Tuple2[Double, Double])]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      @scala.inline
      def setPortsVarargs(value: (Double | (js.Tuple2[Double, Double]))*): Self = StObject.set(x, "ports", js.Array(value :_*))
      
      @scala.inline
      def setQueryContains(value: String): Self = StObject.set(x, "queryContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryContainsUndefined: Self = StObject.set(x, "queryContains", js.undefined)
      
      @scala.inline
      def setQueryEquals(value: String): Self = StObject.set(x, "queryEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryEqualsUndefined: Self = StObject.set(x, "queryEquals", js.undefined)
      
      @scala.inline
      def setQueryPrefix(value: String): Self = StObject.set(x, "queryPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryPrefixUndefined: Self = StObject.set(x, "queryPrefix", js.undefined)
      
      @scala.inline
      def setQuerySuffix(value: String): Self = StObject.set(x, "querySuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerySuffixUndefined: Self = StObject.set(x, "querySuffix", js.undefined)
      
      @scala.inline
      def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      @scala.inline
      def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
      
      @scala.inline
      def setUrlContains(value: String): Self = StObject.set(x, "urlContains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlContainsUndefined: Self = StObject.set(x, "urlContains", js.undefined)
      
      @scala.inline
      def setUrlEquals(value: String): Self = StObject.set(x, "urlEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlEqualsUndefined: Self = StObject.set(x, "urlEquals", js.undefined)
      
      @scala.inline
      def setUrlMatches(value: String): Self = StObject.set(x, "urlMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlMatchesUndefined: Self = StObject.set(x, "urlMatches", js.undefined)
      
      @scala.inline
      def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      @scala.inline
      def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
    }
  }
}
