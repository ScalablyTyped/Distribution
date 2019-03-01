package typings
package esDashFeatureDashDetectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Es2015Es2016 extends js.Object {
  var es2015: stdLib.Record[
    esDashFeatureDashDetectionLib.esDashFeatureDashDetectionMod.ES2015Syntax, 
    scala.Boolean
  ]
  var es2016: stdLib.Record[
    esDashFeatureDashDetectionLib.esDashFeatureDashDetectionMod.ES2016Syntax, 
    scala.Boolean
  ]
  var es2017: stdLib.Record[
    esDashFeatureDashDetectionLib.esDashFeatureDashDetectionMod.ES2017Syntax, 
    scala.Boolean
  ]
}

object Anon_Es2015Es2016 {
  @scala.inline
  def apply(
    es2015: stdLib.Record[
      esDashFeatureDashDetectionLib.esDashFeatureDashDetectionMod.ES2015Syntax, 
      scala.Boolean
    ],
    es2016: stdLib.Record[
      esDashFeatureDashDetectionLib.esDashFeatureDashDetectionMod.ES2016Syntax, 
      scala.Boolean
    ],
    es2017: stdLib.Record[
      esDashFeatureDashDetectionLib.esDashFeatureDashDetectionMod.ES2017Syntax, 
      scala.Boolean
    ]
  ): Anon_Es2015Es2016 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("es2015")(es2015)
    __obj.updateDynamic("es2016")(es2016)
    __obj.updateDynamic("es2017")(es2017)
    __obj.asInstanceOf[Anon_Es2015Es2016]
  }
}

