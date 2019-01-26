package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  // events
  var afterchartdraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var aftergriddraw: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var beforegriddraw: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var beforetoolbarcreated: js.UndefOr[js.Function1[/* toolbar */ Toolbar, scala.Unit]] = js.undefined
  var cellclick: js.UndefOr[js.Function1[/* cell */ CellData, scala.Unit]] = js.undefined
  var celldoubleclick: js.UndefOr[js.Function1[/* cell */ CellData, scala.Unit]] = js.undefined
  var componentFolder: js.UndefOr[java.lang.String] = js.undefined
  // other
  var container: js.UndefOr[java.lang.String] = js.undefined
  var customizeCell: js.UndefOr[js.Function2[/* cell */ CellBuilder, /* data */ CellData, scala.Unit]] = js.undefined
  var customizeContextMenu: js.UndefOr[
    js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ java.lang.String, 
      js.Array[ContextMenuItem]
    ]
  ] = js.undefined
  var datachanged: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var dataerror: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var datafilecancelled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var dataloaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var exportcomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var exportstart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fieldslistclose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fieldslistopen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var filterclose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var filteropen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var global: js.UndefOr[Report] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var licenseKey: js.UndefOr[java.lang.String] = js.undefined
  var loadingdata: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var loadinglocalization: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var loadingolapstructure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var loadingreportfile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var localizationerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var localizationloaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var olapstructureerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var olapstructureloaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var openingreportfile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var printcomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var printstart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var querycomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var queryerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var report: js.UndefOr[Report | java.lang.String] = js.undefined
  var reportchange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reportcomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reportfilecancelled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reportfileerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var runningquery: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // params
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

