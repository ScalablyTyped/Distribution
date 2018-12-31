package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSettings extends js.Object {
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  var border: js.UndefOr[scala.Boolean] = js.undefined
  var cascadeCheck: js.UndefOr[scala.Boolean] = js.undefined
  var cascadeSelection: js.UndefOr[scala.Boolean] = js.undefined
  var checkboxChange: js.UndefOr[
    js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ java.lang.String, _]
  ] = js.undefined
  var checkboxes: js.UndefOr[scala.Boolean] = js.undefined
  var checkedField: js.UndefOr[java.lang.String] = js.undefined
  var childrenField: js.UndefOr[java.lang.String] = js.undefined
  var collapse: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var disable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var disabledField: js.UndefOr[java.lang.String] = js.undefined
  var dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  var enable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var expand: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var hasChildrenField: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[TreeIcons] = js.undefined
  var iconsLibrary: js.UndefOr[java.lang.String] = js.undefined
  var imageCssClassField: js.UndefOr[java.lang.String] = js.undefined
  var imageHtmlField: js.UndefOr[java.lang.String] = js.undefined
  var imageUrlField: js.UndefOr[java.lang.String] = js.undefined
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var lazyLoading: js.UndefOr[scala.Boolean] = js.undefined
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var nodeDrop: js.UndefOr[
    js.Function4[
      /* e */ js.Any, 
      /* id */ java.lang.String, 
      /* parentId */ java.lang.String, 
      /* orderNumber */ scala.Double, 
      _
    ]
  ] = js.undefined
  var paramNames: js.UndefOr[TreeParamNames] = js.undefined
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var selectionType: js.UndefOr[java.lang.String] = js.undefined
  var textField: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var unselect: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

