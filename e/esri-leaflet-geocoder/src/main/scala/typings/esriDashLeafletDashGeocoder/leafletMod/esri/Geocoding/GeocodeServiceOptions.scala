package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceOptions * / any */ trait GeocodeServiceOptions extends js.Object {
  var supportsSuggest: js.UndefOr[Boolean] = js.undefined
}

object GeocodeServiceOptions {
  @scala.inline
  def apply(supportsSuggest: js.UndefOr[Boolean] = js.undefined): GeocodeServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(supportsSuggest)) __obj.updateDynamic("supportsSuggest")(supportsSuggest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeServiceOptions]
  }
}

