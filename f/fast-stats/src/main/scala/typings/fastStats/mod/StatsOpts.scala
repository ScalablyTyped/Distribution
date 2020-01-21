package typings.fastStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsOpts extends js.Object {
  /**
    * Tells fast-stats how to extend the pre-defined buckets if data exceeding the range is added. This is useful to capture data above your range, in multiple buckets, but with low precision so you do not end up with a large number of empty buckets.
    * By default this is not defined, so buckets will not be extended and all data beyond the end range will end up in the last bucket.
    */
  var bucket_extension_interval: js.UndefOr[Double] = js.undefined
  /**
    * Tells fast-stats to maintain a histogram of your dataset using this parameter as the least count, or precision.
    * By default, fast-stats will not maintain buckets since it does not know the least count and range of your dataset in advance.
    * This option is required if you need to use the distribution() method.
    */
  var bucket_precision: js.UndefOr[Double] = js.undefined
  /**
    * Tells fast-stats to maintain a histogram of your dataset using these custom buckets.
    * Each number in the array is the upper limit of a bucket. The lower limit of the first bucket is 0, the lower limit for all other buckets is the upper limit of the previous bucket.
    * If you use both bucket_precision and buckets, buckets takes precedence.
    */
  var buckets: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Tells fast-stats whether the data you pass in is a sample (true) or the entire (false default) population.
    * The standard deviation algorithm differs for populations v/s samples.
    */
  var sampling: js.UndefOr[Boolean] = js.undefined
  /**
    * Tells fast-stats not to store actual data values. This is useful to reduce memory utilisation for large datasets, however it comes with a few caveats.
    * - You can no longer get an exact median or other percentile value out of your dataset, however you could use bucketing (see bucket_precision above) to get an approximate percentile value.
    * - You can no longer run an exact iqr filter or a band_pass filter on the data, however you could use bucketing to get an approximate filtered object.
    * - You can no longer get at the entire dataset or remove data from the dataset.
    * The mean, standard deviation and margin of error calculations are unaffected by this parameter. If you use bucketing, and only care about the mean, standard deviation and margin of error or an approximate median or percentile value, set this option to false.
    * By default, store_data is true.
    */
  var store_data: js.UndefOr[Boolean] = js.undefined
}

object StatsOpts {
  @scala.inline
  def apply(
    bucket_extension_interval: Int | Double = null,
    bucket_precision: Int | Double = null,
    buckets: js.Array[Double] = null,
    sampling: js.UndefOr[Boolean] = js.undefined,
    store_data: js.UndefOr[Boolean] = js.undefined
  ): StatsOpts = {
    val __obj = js.Dynamic.literal()
    if (bucket_extension_interval != null) __obj.updateDynamic("bucket_extension_interval")(bucket_extension_interval.asInstanceOf[js.Any])
    if (bucket_precision != null) __obj.updateDynamic("bucket_precision")(bucket_precision.asInstanceOf[js.Any])
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (!js.isUndefined(sampling)) __obj.updateDynamic("sampling")(sampling.asInstanceOf[js.Any])
    if (!js.isUndefined(store_data)) __obj.updateDynamic("store_data")(store_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsOpts]
  }
}

