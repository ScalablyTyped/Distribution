package typings.fastStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsOpts extends js.Object {
  
  /**
    * Tells fast-stats how to extend the pre-defined buckets if data exceeding the range is added. This is useful to capture data above your range, in multiple buckets, but with low precision so you do not end up with a large number of empty buckets.
    * By default this is not defined, so buckets will not be extended and all data beyond the end range will end up in the last bucket.
    */
  var bucket_extension_interval: js.UndefOr[Double] = js.native
  
  /**
    * Tells fast-stats to maintain a histogram of your dataset using this parameter as the least count, or precision.
    * By default, fast-stats will not maintain buckets since it does not know the least count and range of your dataset in advance.
    * This option is required if you need to use the distribution() method.
    */
  var bucket_precision: js.UndefOr[Double] = js.native
  
  /**
    * Tells fast-stats to maintain a histogram of your dataset using these custom buckets.
    * Each number in the array is the upper limit of a bucket. The lower limit of the first bucket is 0, the lower limit for all other buckets is the upper limit of the previous bucket.
    * If you use both bucket_precision and buckets, buckets takes precedence.
    */
  var buckets: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Tells fast-stats whether the data you pass in is a sample (true) or the entire (false default) population.
    * The standard deviation algorithm differs for populations v/s samples.
    */
  var sampling: js.UndefOr[Boolean] = js.native
  
  /**
    * Tells fast-stats not to store actual data values. This is useful to reduce memory utilisation for large datasets, however it comes with a few caveats.
    * - You can no longer get an exact median or other percentile value out of your dataset, however you could use bucketing (see bucket_precision above) to get an approximate percentile value.
    * - You can no longer run an exact iqr filter or a band_pass filter on the data, however you could use bucketing to get an approximate filtered object.
    * - You can no longer get at the entire dataset or remove data from the dataset.
    * The mean, standard deviation and margin of error calculations are unaffected by this parameter. If you use bucketing, and only care about the mean, standard deviation and margin of error or an approximate median or percentile value, set this option to false.
    * By default, store_data is true.
    */
  var store_data: js.UndefOr[Boolean] = js.native
}
object StatsOpts {
  
  @scala.inline
  def apply(): StatsOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsOpts]
  }
  
  @scala.inline
  implicit class StatsOptsOps[Self <: StatsOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket_extension_interval(value: Double): Self = this.set("bucket_extension_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket_extension_interval: Self = this.set("bucket_extension_interval", js.undefined)
    
    @scala.inline
    def setBucket_precision(value: Double): Self = this.set("bucket_precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket_precision: Self = this.set("bucket_precision", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: Double*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[Double]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    
    @scala.inline
    def setSampling(value: Boolean): Self = this.set("sampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampling: Self = this.set("sampling", js.undefined)
    
    @scala.inline
    def setStore_data(value: Boolean): Self = this.set("store_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore_data: Self = this.set("store_data", js.undefined)
  }
}
