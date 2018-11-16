package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Documentation extends js.Object {
  /** The URL to the root of documentation. */
  var documentationRootUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Declares a single overview page. For example:
               * <pre><code>documentation:
               * summary: ...
               * overview: &#40;== include overview.md ==&#41;
               * </code></pre>
               * This is a shortcut for the following declaration (using pages style):
               * <pre><code>documentation:
               * summary: ...
               * pages:
               * - name: Overview
               * content: &#40;== include overview.md ==&#41;
               * </code></pre>
               * Note: you cannot specify both `overview` field and `pages` field.
               */
  var overview: js.UndefOr[java.lang.String] = js.undefined
  /** The top level pages for the documentation set. */
  var pages: js.UndefOr[js.Array[Page]] = js.undefined
  /**
               * A list of documentation rules that apply to individual API elements.
               *
               * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
               */
  var rules: js.UndefOr[js.Array[DocumentationRule]] = js.undefined
  /**
               * A short summary of what the service does. Can only be provided by
               * plain text.
               */
  var summary: js.UndefOr[java.lang.String] = js.undefined
}

